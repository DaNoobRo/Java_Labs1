package Lab7;

import java.util.Scanner;

public class CoffeeTest {
    public static void main(String[] args) {
        CoffeeMaker mk = new CoffeeMaker();
        CoffeeDrinker d = new CoffeeDrinker();

        Scanner scanner = new Scanner(System.in);

        int dailyQuota;
        System.out.print("How many coffees need to be created today ? : ");
        dailyQuota = scanner.nextInt();
        CoffeeMaker.setNeededInstances(dailyQuota);

        for(int i = 0;i<15;i++){
            try {
                Coffee c=mk.makeCoffee();
                try{
                    d.drinkCoffee(c);
                }
                catch (TemperatureException e) {
                    System.out.println("Exception:"+e.getMessage()+" temp="+e.getTemp());
                }
                catch (ConcentrationException e) {
                    System.out.println("Exception:"+e.getMessage()+" conc="+e.getConc());
                }
            }
            catch (DailyQuota e){
                System.out.println("Exception : " + e.getMessage());
                System.exit(1);
            }
            finally{
                System.out.println("Throw the coffee cup.\n");
            }
        }
    }
}
