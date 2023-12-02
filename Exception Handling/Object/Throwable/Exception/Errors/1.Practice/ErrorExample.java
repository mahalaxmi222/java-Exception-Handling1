public class ErrorExample {
    public static void main(String[] args) {
        try {
            // Some code that might cause an error
        } catch (Error e) {
            e.printStackTrace();
        }
    }
}
