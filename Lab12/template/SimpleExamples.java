package Lab12.template;

/**
 * @author Radu Miron
 * @version 1
 */
public class SimpleExamples {

    public static void main(String[] args) {
        System.out.printf("%d + %d = %d\n", 11, 12, ArithmeticOperationsUtils.add(11, 12));
        System.out.printf("%d - %d = %d\n", 11, 12, ArithmeticOperationsUtils.substract(11, 12));
        System.out.printf("%d * %d = %d\n", 11, 12, ArithmeticOperationsUtils.multiply(11, 12));
        System.out.printf("%d / %d = %f\n", 11, 12, ArithmeticOperationsUtils.divide(11, 12));
    }
}
