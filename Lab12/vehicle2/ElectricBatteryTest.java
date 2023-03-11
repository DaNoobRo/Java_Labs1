package Lab12.vehicle2;

import org.junit.Test;

public class ElectricBatteryTest {

    /**
     * Expect battery to throw exception if charged more than 100%
     */
    @Test(expected = BatteryException.class)
    public void charge() throws BatteryException {
        ElectricBattery bat = new ElectricBattery();
        for(int i=0;i<110;i++)
            bat.charge();

    }
}