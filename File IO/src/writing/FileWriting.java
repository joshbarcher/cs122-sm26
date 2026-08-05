package writing;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriting {
    public static void main(String[] args) {

        PrintWriter writer = null;
        try {
            writer = new PrintWriter("files/poem.txt");

            writer.println("At 2 a.m. I write to no one:");
            writer.println("fixed the thing that broke the thing.");
            writer.println("Tomorrow's me will read that line");
            writer.println("and hate me with a quiet, patient hate.");

            writer.println();
            writer.println("The bug was never in the loop.");
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error writing to file: " + ex.getMessage());
        } finally {
            if (writer != null) {
                writer.close();
            }
        }

    }
}