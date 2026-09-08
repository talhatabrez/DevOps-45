public class CalculatorTest {

    public static void main(String[] args) {

        testAdd();
        testSubtract();
        testMultiply();
        testDivide();

        System.out.println("All tests passed!");
    }

    static void testAdd() {
        if (Calculator.add(2, 3) != 5) {
            throw new AssertionError("Addition test failed");
        }
    }

    static void testSubtract() {
        if (Calculator.subtract(5, 3) != 2) {
            throw new AssertionError("Subtraction test failed");
        }
    }

    static void testMultiply() {
        if (Calculator.multiply(4, 3) != 12) {
            throw new AssertionError("Multiplication test failed");
        }
    }

    static void testDivide() {
        if (Calculator.divide(10, 2) != 5) {
            throw new AssertionError("Division test failed");
        }
    }
}