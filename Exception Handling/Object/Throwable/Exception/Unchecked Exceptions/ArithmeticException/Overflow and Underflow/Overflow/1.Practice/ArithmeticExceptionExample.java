public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int maxInt = Integer.MAX_VALUE;
            int result = maxInt + 1; // Overflow
            System.out.println(result);
        } catch (ArithmeticException e) {
            // Handle the exception, log it, or take appropriate action
            e.printStackTrace();
        }
    }
}
