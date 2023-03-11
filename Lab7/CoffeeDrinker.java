package Lab7;

public class CoffeeDrinker {
    void drinkCoffee(Coffee c) throws TemperatureException, ConcentrationException{
        if(c.getTemp()>60)
            throw new TemperatureException(c.getTemp(),"Coffee is too hot!");
        if(c.getConc()>50)
            throw new ConcentrationException(c.getConc(),"Coffee concentration too high!");
        System.out.println("Drink coffee:"+c);
    }
}
