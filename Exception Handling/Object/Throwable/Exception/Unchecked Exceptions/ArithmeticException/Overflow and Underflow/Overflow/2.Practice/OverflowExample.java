public class OverflowExample {
    public static void main(String[] args) {
        try {
            int maxInt = Integer.MAX_VALUE;
            int result = Math.addExact(maxInt, 1); // Using Math.addExact to detect overflow
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Overflow occurred.");
        }
    }
}
