import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        try {
            // Code that may throw an IOException
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            // Handle the IOException, log it, or take appropriate action
            e.printStackTrace();
        }
    }
}
