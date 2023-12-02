public class StackOverflowExample {
    public static void main(String[] args) {
        try {
            // Call a method that causes a stack overflow
            infiniteRecursion();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
    }

    // Method with infinite recursion
    public static void infiniteRecursion() {
        // This method calls itself without a termination condition
        infiniteRecursion();
    }
}
