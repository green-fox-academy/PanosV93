import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("myfakefile.txt");
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(Arrays.toString(lines.toArray()));

        } catch (Exception e){
            System.out.println("0");
        }
    }
}
