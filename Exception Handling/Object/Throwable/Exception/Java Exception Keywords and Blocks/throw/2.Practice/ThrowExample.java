public class ThrowExample {

    public static void main(String[] args) {
        try {
            // Call a method that might throw a custom exception
            validateAge(15);
        } catch (InvalidAgeException e) {
            // Handling the custom exception
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        // Custom condition to throw an exception
        if (age < 18) {
            // Using the throw keyword to throw a custom exception
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Age validation successful.");
        }
    }
}

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
