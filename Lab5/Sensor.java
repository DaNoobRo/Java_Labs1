package Lab5;

public abstract class Sensor {
    private String location;
    public abstract int readValue();

    public String getLocation() {
        return location;
    }

}
