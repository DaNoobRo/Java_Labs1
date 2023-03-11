package Lab12.electronic_device;

import org.junit.Test;

import static org.junit.Assert.*;

public class TVTest {

    @Test
    public void TvTest(){
        TV t = new TV();
        t.channel = 9;
        t.channelUp();
        assertEquals(10,t.getChannel());
        t.channelDown();
        assertEquals(9,t.getChannel());
    }
}
