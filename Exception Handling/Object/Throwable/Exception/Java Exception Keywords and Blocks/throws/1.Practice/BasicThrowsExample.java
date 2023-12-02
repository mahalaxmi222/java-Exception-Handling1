import java.util.Scanner;

public class BasicThrowsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        try {
            // Call a method that declares a checked exception with throws
            performDivision(userInput);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Error: " + e.getMessage());
        }

        // Close resources
        scanner.close();
        System.out.println("Program continues executing...");
    }

    // Method declaration with throws
    private static void performDivision(int divisor) throws ArithmeticException {
        // Check for division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        // Perform division
        int result = 10 / divisor;
        System.out.println("Result of division: " + result);
    }
}
