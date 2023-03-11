package Lab5;

import java.util.Random;

public class LightSensor extends Sensor {
    private int lightSensor;

    public LightSensor() {
        this.lightSensor = 0;
    }

    public int readValue(){
        Random rand = new Random();
        this.lightSensor = rand.nextInt(100);
        return lightSensor;
    }
}
