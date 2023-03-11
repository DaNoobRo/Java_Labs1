package Lab12.vehicle2;

import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    @Test
    public void testCreate(){
        Vehicle v1 = new Vehicle("demo1", 1500);
        Vehicle v2 = new Vehicle("demo1", 1500);
        assertEquals(v1, v2);
    }

    @Test
    public void testStart(){
        Vehicle v1 = new Vehicle("demo1", 1500);
        assertEquals("engine started", v1.start());
    }

}