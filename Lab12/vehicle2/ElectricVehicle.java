package Lab12.vehicle2;

public class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String type, int weight) {
        super(type, weight);
    }
    public String start(){
        return "electric engine started";
    }
}
