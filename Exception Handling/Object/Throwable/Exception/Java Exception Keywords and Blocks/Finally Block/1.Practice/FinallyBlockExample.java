public class FinallyBlockExample {

    public static void main(String[] args) {
        try {
            // Code that might throw exceptions
            int result = divide(10, 2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling ArithmeticException
            System.err.println("Error: " + e.getMessage());
        } finally {
            // Code in the finally block will be executed regardless of whether an exception occurs or not
            System.out.println("Finally block always executes.");
        }
        
        System.out.println("Code after the try-catch-finally block.");
    }

    public static int divide(int numerator, int denominator) {
        // This method simulates a division operation that might throw an ArithmeticException
        return numerator / denominator;
    }
}
