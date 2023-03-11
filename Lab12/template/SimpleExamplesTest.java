package Lab12.template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Radu Miron
 * @version 1
 */
public class SimpleExamplesTest {

    @Test
    public void testAdd() {
        assertEquals("ArithmeticOperation.add() is not working ", 23, ArithmeticOperationsUtils.add(11, 12));
    }

    @Test
    public void testSubstract() {
        // todo: fix it
        assertEquals("ArithmeticOperation.substract() is not working ", -1, ArithmeticOperationsUtils.substract(11, 12));
    }

    @Test
    public void testMultiply() {
        assertEquals("ArithmeticOperation.multiply() is not working ", 132, ArithmeticOperationsUtils.multiply(11, 12));
    }

    @Test
    public void testDivide() {
        assertEquals("ArithmeticOperation.divide() is not working ", 0.9166666865348816, ArithmeticOperationsUtils.divide(11, 12), 0);
    }

}
