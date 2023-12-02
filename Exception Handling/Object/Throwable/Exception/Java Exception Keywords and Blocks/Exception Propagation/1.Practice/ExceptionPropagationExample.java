public class ExceptionPropagationExample {

    public static void main(String[] args) {
        try {
            // Call a method that might throw an exception
            method1();
        } catch (Exception e) {
            // Handling the exception at the top-level of the call stack
            System.err.println("Top-level exception handler: " + e.getMessage());
        } finally {
            // This block is always executed, whether an exception occurred or not
            System.out.println("Finally block in the main method.");
        }
    }

    public static void method1() {
        try {
            // Call another method that might throw an exception
            method2();
        } catch (Exception e) {
            // Handle the exception or rethrow it if needed
            System.err.println("Exception caught in method1: " + e.getMessage());
            throw e; // Propagate the exception further
        } finally {
            // This block is always executed, whether an exception occurred or not
            System.out.println("Finally block in method1.");
        }
    }

    public static void method2() {
        try {
            // Simulate an exception
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            // Handle the exception or rethrow it if needed
            System.err.println("ArithmeticException caught in method2: " + e.getMessage());
            throw e; // Propagate the exception further
        } finally {
            // This block is always executed, whether an exception occurred or not
            System.out.println("Finally block in method2.");
        }
    }
}

