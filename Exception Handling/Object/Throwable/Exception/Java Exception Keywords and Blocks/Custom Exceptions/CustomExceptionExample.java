// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Example of using the custom exception
public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulating a situation that triggers the custom exception
            throw new CustomException("This is a custom exception message.");
        } catch (CustomException e) {
            // Handling the custom exception
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }
}
