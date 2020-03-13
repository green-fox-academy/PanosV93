import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        FileInputStream instream = null;
        FileOutputStream outstream = null;
        try {
            File infile = new File("C:\\Users\\Asus\\Desktop\\GreenFox\\input.txt");
            File outfile = new File("C:\\Users\\Asus\\Desktop\\GreenFox\\output.txt");
            instream = new FileInputStream(infile);
            outstream = new FileOutputStream(outfile);
            byte [] buffer = new byte[1024];
            //1024 byte cause there is no way of knowing the length of the input stream
            int length;
            //Copy the contents from input to output with read and write methods
            while ((length = instream.read(buffer)) > 0){
                outstream.write(buffer, 0, length);
            }

            instream.close();
            outstream.close();
            System.out.println("Congrats, the file was copied successfully!");

        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
