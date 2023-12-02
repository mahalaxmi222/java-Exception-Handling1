public class ExceptionPropagationExample {

    public static void main(String[] args) {
        try {
            // Call a method that might throw an exception
            method1();
        } catch (Exception e) {
            // Handling the exception at the top-level of the call stack
            System.err.println("Top-level exception handler: " + e.getMessage());
        }
    }

    public static void method1() {
        // Call another method that might throw an exception
        method2();
    }

    public static void method2() {
        // Simulate an exception
        int result = 10 / 0; // This will throw an ArithmeticException
    }
}
