import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryExample {
    public static void main(String[] args) {
        try {
            // Create a list to store objects
            List<Object> objectList = new ArrayList<>();

            // Intentionally cause an OutOfMemoryError by adding objects in an infinite loop
            while (true) {
                objectList.add(new Object());
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Caught OutOfMemoryError: " + e.getMessage());
        }
    }
}
