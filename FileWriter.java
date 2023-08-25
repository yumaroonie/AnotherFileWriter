import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter {
    public String fileToString (String filename)
    {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }

    public void stringToFile (String input, String filename)
    {
        PrintWriter out = new PrintWriter(filename);
        out.println(input);
        out.close();
    }
}