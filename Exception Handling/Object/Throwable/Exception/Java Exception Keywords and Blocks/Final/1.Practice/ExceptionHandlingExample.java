public class ExceptionHandlingExample {
    // Example of a constant variable
    public static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {
        // Example of a final variable
        final String greeting = "Hello";

        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Exception handling
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Cleanup code (always executed)
            System.out.println("Finally block executed.");
        }

        // Example of a final method
        displayGreeting(greeting);
    }

    // Example of a final method
    public static final void displayGreeting(final String message) {
        System.out.println(message);
    }

    // Example of a method that may throw an exception
    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
