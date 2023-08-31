import java.io.FileNotFoundException;
import java.io.IOException;

public class FileWriterTester
{
    public static void main (String [] args) throws FileNotFoundException
    {
        FileWriter myWriter = new FileWriter ();

        myWriter.stringToFile("Susmebit", "MyTextFile.txt");
        System.out.println(myWriter.fileToString ("MyTextFile.txt"));
        System.out.println(myWriter.countCharacters("MyTextFile.txt"));
        
    }
}