package Lab12.vehicle;

import java.util.Objects;

public class Vehicle implements  Comparable<Vehicle>{
    private String type;
    private int weight;

    public Vehicle(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return weight == vehicle.weight &&
                type.equals(vehicle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, weight);
    }

    @Override
    public int compareTo(Vehicle o) {

            if (weight == o.weight)
                return 0;
            else if (weight > o.weight)
                return 1;
            else
                return -1;
    }
    }
