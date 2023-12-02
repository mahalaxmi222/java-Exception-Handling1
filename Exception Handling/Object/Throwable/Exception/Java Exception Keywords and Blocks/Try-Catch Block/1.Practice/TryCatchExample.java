public class TryCatchExample {

    public static int divide(int numerator, int denominator) {
        // This method simulates a division operation that might throw an ArithmeticException
        return numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            // Trying to divide 10 by 0, which will result in an ArithmeticException
            int result = divide(10, 0);
            System.out.println("Result: " + result); // This line won't be reached due to the exception
        } catch (ArithmeticException e) {
            // Handling the ArithmeticException
            System.err.println("Error: " + e.getMessage());
        } finally {
            // This block will be executed regardless of whether an exception occurs or not
            System.out.println("This code always executes.");
        }
    }
}
