import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
      try {
          readFile();
          writeFile();
      }
      catch (NoSuchFileException e) {
          System.out.println("Such file does not exist");
          e.printStackTrace();
      }catch (IOException e){
          System.out.println("Io Exception");
          e.printStackTrace();
      }catch (Exception e){
          System.out.println("Something went very wrong");
          e.printStackTrace();
      }
        System.out.println("Method finished");
    }
    public static List<String> readFile() throws IOException {
        Path path = Paths.get("my-file.txt");
        List<String> lines = Files.readAllLines(path);
        for (String line : lines){
            System.out.println(line);
        }
        return lines;
    }
    public static void writeFile () throws IOException {
        Path path = Paths.get("my-file.txt");
        List<String> lines = readFile();
        lines.add("Panagiotis Voutsinas");
        Files.write(path, lines);
    }
}
