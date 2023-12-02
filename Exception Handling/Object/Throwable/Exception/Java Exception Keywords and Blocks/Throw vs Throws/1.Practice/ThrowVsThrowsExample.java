import java.io.IOException;

public class ThrowVsThrowsExample {

    public static void main(String[] args) {
        try {
            // Calling a method that declares it might throw an IOException
            readFile();
        } catch (IOException e) {
            // Handling the IOException
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    // Using throws to declare that this method might throw an IOException
    public static void readFile() throws IOException {
        // Using throw to explicitly throw an IOException
        throw new IOException("File not found");
    }
}
