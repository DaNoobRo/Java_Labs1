package Lab5;

import java.util.Random;

public class TemperatureSensor extends Sensor {
    private int tempSensor;

    public TemperatureSensor() {
        this.tempSensor = 0;
    }

    public int readValue(){
        Random rand = new Random();
        this.tempSensor = rand.nextInt(100);
        return tempSensor;
    }
}
