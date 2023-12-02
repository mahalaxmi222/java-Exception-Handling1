import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Use try-with-resources to automatically close the BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read and print each line from the file
            while ((line = reader.readLine()) != null) {
                System.out.println("Line from file: " + line);
            }
        } catch (IOException e) {
            // Handle IOException
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
