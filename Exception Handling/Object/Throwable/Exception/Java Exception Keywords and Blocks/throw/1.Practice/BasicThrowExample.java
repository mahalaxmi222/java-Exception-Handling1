import java.util.Scanner;

public class BasicThrowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an age: ");
        int age = scanner.nextInt();

        try {
            // Call a method that throws a custom exception using throw
            validateAge(age);
        } catch (IllegalArgumentException e) {
            // Handle the exception
            System.out.println("Error: " + e.getMessage());
        }

        // Close resources
        scanner.close();
        System.out.println("Program continues executing...");
    }

    // Method that throws a custom exception using throw
    private static void validateAge(int age) {
        // Check for invalid age
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        // Process valid age
        System.out.println("Valid age: " + age);
    }
}
