package file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) {
        readFile();
        writeFile();
    }

    public static void readFile() {

        Scanner reader = null;
        try {
            reader = new Scanner(new FileInputStream("/files/data.txt"));

            //what happens if an error occurs here!m 
            String line = reader.nextLine();
            IO.println(line);

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }

    public static void writeFile() {

    }
}
