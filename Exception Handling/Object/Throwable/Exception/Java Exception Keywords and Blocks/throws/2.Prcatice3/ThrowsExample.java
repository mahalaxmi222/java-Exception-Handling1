import java.io.IOException;

public class ThrowsExample {

    public static void main(String[] args) {
        try {
            // Call a method that declares it might throw an IOException
            readFile();
        } catch (IOException e) {
            // Handling the IOException
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public static void readFile() throws IOException {
        // Simulate a method that might throw an IOException
        throw new IOException("File not found");
    }
}
