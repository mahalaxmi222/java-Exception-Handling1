public class UnderflowExample {
    public static void main(String[] args) {
        try {
            float minValue = Float.MIN_VALUE;
            float result = minValue / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Underflow occurred.");
        }
    }
}
