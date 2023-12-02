public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 5 / 0; // Attempting to divide by zero
            System.out.println(result);
        } catch (ArithmeticException e) {
            // Handle the exception, log it, or take appropriate action
            e.printStackTrace();
        }
    }
}
