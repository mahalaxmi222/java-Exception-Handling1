public class UnderflowExample {
    public static void main(String[] args) {
        try {
            double minValue = Double.MIN_VALUE;
            double result = minValue / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Underflow occurred.");
        }
    }
}
