package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadList {

    public static void main (String[] args) throws IOException {

        String numbers = "resources/numbers.txt";
        File numbersToRead = new File(numbers);
        cat(numbersToRead);
    }


    public static void cat(File file) throws IOException {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, the file you tried to read was not found. Error message:"
                    + e.getLocalizedMessage());
        } catch (IOException a) {
            System.out.println("Sorry there was an IOException. Message:" + a.getLocalizedMessage());
        }
        finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
