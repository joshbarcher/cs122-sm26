package fs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fun {
    public static void main(String[] args) {
        File file = new File("data/other-name.txt");
        File folder = new File("C:\\Windows");

        System.out.println("File? " + file.isFile());
        System.out.println("Folder? " + file.isDirectory());

        //rwx = read/write/exec
        System.out.println("Read? " + file.canRead());
        System.out.println("Write? " + file.canWrite());
        System.out.println("Execute? " + file.canExecute());

        if (file.exists()) {
            //print out the file we found
            System.out.println("Found the file/folder - " + file.getAbsolutePath());

            try {
                Scanner reader = new Scanner(new FileInputStream(file));
                String line = reader.nextLine();
                System.out.println("Line in file: " + line);
            } catch (FileNotFoundException ex) {
                //what if the file can't be read...
            }
        } else {
            System.out.println("File/folder not found - " + file.getAbsolutePath());
        }

        if (folder.isDirectory()) {
            String[] names = folder.list();
            File[] files = folder.listFiles();

            for (int i = 0; i < files.length; i++) {
                File oneFile = files[i];

                System.out.println(oneFile.getName() + " - write? " + oneFile.canWrite());
            }
        }
    }
}
