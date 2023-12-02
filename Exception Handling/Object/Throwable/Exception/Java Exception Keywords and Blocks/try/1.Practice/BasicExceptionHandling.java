import java.util.Scanner;

public class BasicExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Try to get user input
            System.out.print("Enter a number: ");
            int userInput = scanner.nextInt();

            // Perform a calculation
            int result = 10 / userInput;

            // Display the result
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the specific exception (division by zero)
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handle any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Close resources or perform cleanup operations
            scanner.close();
        }

        System.out.println("Program continues executing...");
    }
}
