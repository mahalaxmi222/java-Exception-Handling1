public class MultipleCatchExample {

    public static void main(String[] args) {
        try {
            // Code that might throw exceptions
            int[] numbers = {1, 2, 3};
            System.out.println("Trying to access an element outside the array bounds: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling ArrayIndexOutOfBoundsException
            System.err.println("Error: Array index out of bounds - " + e.getMessage());
        } catch (ArithmeticException e) {
            // Handling ArithmeticException
            System.err.println("Error: Arithmetic exception - " + e.getMessage());
        } catch (Exception e) {
            // Handling other types of exceptions (general catch block)
            System.err.println("Error: Something went wrong - " + e.getMessage());
        } finally {
            // Code in the finally block will be executed regardless of whether an exception occurs or not
            System.out.println("Finally block always executes.");
        }
    }
}
