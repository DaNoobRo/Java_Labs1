package Lab7;

public class CoffeeMaker {

    private static int instances = 0;
    private static int neededInstances;

    public static void setNeededInstances(int neededInstances) {
        CoffeeMaker.neededInstances = neededInstances;
    }

    Coffee makeCoffee() throws DailyQuota{
        System.out.println("Make a coffee");

        int t = (int)(Math.random()*100);
        int c = (int)(Math.random()*100);

        instances++;
        if(instances >neededInstances)
            throw new DailyQuota(neededInstances-instances,"Too much coffee");
        return new Coffee(t,c);
    }

}
