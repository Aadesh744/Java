import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class filehandling1 {
    public static void main(String[] args) {
        String filename = "bikesh.txt";

        // Writing to a file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("i am from chandrapur.!\n");
            writer.write("i am aadesh yadav!");
        } catch (IOException e) {
            System.err.println("get error message or exception: " + e.getMessage());
        }

        // Reading from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("get error messages or expception: " + e.getMessage());
        }
    }
}
