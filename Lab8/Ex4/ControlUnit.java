package Lab8.Ex4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ControlUnit {
    private PrintWriter writer = new PrintWriter("system_logs.txt");

    private AlarmUnit alarm = new AlarmUnit();
    private HeatingUnit heatingUnit = new HeatingUnit();
    private CoolingUnit coolingUnit = new CoolingUnit();
    private GsmUnit gsmUnit = new GsmUnit();

    private static int instances = 0;
    private ControlUnit() throws FileNotFoundException {instances++;}
    public static ControlUnit Instantiate() throws FileNotFoundException {
        if ( instances < 1)
            return new ControlUnit();
        else return null;
    }

    public void startAlarm()
    {
        alarm.activate();
        writer.println("Alarm has been activated");
    }

    public void callOwner()
    {
        gsmUnit.callOwner();
        writer.println("Owner has been called.");
    }

    public void startHeater()
    {
        heatingUnit.activate();
        writer.println("Heating Unit has been activated.");
    }

    public void startCooler()
    {
        coolingUnit.activate();
        writer.println("Cooling Unit has been activated.");
    }
}
