import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryExample {
    public static void main(String[] args) {
        try {
            // Create a list to store a large number of objects
            List<byte[]> byteArrayList = new ArrayList<>();

            // Intentionally cause an OutOfMemoryError by adding large arrays to the list
            while (true) {
                byte[] byteArray = new byte[1024 * 1024]; // Allocate 1 MB array
                byteArrayList.add(byteArray);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Caught OutOfMemoryError: " + e.getMessage());
        }
    }
}
