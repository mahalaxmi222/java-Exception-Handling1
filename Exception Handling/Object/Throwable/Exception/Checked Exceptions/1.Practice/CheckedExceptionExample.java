import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            FileReader fr = new FileReader(file);
            // Perform operations with FileReader
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
