import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("my-file.txt");
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.get(0));
         //   System.out.println(Arrays.toString(lines.toArray())); prints out whole list
        }catch (IOException ee) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}
