public class ModuloByZeroExample {
    public static void main(String[] args) {
        try {
            int result = 10 % 0; // Attempting to perform modulo by zero
            System.out.println(result);
        } catch (ArithmeticException e) {
            // Handle the exception, log it, or take appropriate action
            e.printStackTrace();
        }
    }
}
