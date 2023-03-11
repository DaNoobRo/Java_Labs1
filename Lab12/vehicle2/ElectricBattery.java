package Lab12.vehicle2;

public class ElectricBattery {

    /**
     * Percentage load.
     */
    private int charge = 0;

    public void charge() throws BatteryException {
        if(charge>100)
            throw new BatteryException("The battery is fully charged!");
        else
        charge++;
    }

}
