import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriter {
    public String fileToString(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        String myString = scanner.useDelimiter("\\A").next();
        scanner.close();
        return myString;
    }

    public void stringToFile(String input, String fileName) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(fileName);
        out.print(input);
        out.close();
    }

    public int countCharacters(String fileName) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            
            int characterCount = 0;

            while (bufferedReader.ready()) {
                bufferedReader.read();
                characterCount++;
            }

            bufferedReader.close();
            return characterCount;

        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

}