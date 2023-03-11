package Lab12.electronic_device;

import org.junit.Test;

import static org.junit.Assert.*;

public class ElectronicDeviceTest {

    @Test
    public void EDTest() {
        ElectronicDevice a = new ElectronicDevice();
        a.turnOn();
        assertEquals(true, a.isPowered());
        a.turnOff();
        assertEquals(false, a.isPowered());
    }
}
