public class NestedTryExample {

    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block starts.");
            
            try {
                // Inner try block
                System.out.println("Inner try block starts.");
                int result = divide(10, 0); // This might throw an ArithmeticException
                System.out.println("Result: " + result); // This line won't be reached due to the exception
            } catch (ArithmeticException innerException) {
                // Handling ArithmeticException in the inner try block
                System.err.println("Inner try block error: " + innerException.getMessage());
            } finally {
                // Code in the inner finally block will be executed regardless of whether an exception occurs or not in the inner try block
                System.out.println("Inner finally block always executes.");
            }
            
            System.out.println("Code after the inner try-catch-finally block.");
        } catch (Exception outerException) {
            // Handling any exceptions in the outer try block
            System.err.println("Outer try block error: " + outerException.getMessage());
        } finally {
            // Code in the outer finally block will be executed regardless of whether an exception occurs or not in the outer try block
            System.out.println("Outer finally block always executes.");
        }
        
        System.out.println("Code after the outer try-catch-finally blocks.");
    }

    public static int divide(int numerator, int denominator) {
        // This method simulates a division operation that might throw an ArithmeticException
        return numerator / denominator;
    }
}
