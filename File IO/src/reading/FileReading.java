package reading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(new FileInputStream("files/employees.dat"))) {
            if (reader.hasNextLine()) {
                
            }

            //while there are more lines to read
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error reading from file: " + ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("File format changed: " + ex.getMessage());
        }
    }
    
    //Technique #2 (the cool way!)
    public static void readEmpRecord2(Scanner reader) {
        String line = reader.nextLine();
        String[] tokens = line.split("");

        System.out.println(Arrays.toString(tokens));

        //convert to our data types
        int empNum = Integer.parseInt(tokens[0]);
        String name = tokens[1];
        boolean salaried = Boolean.parseBoolean(tokens[2]);
        String date = tokens[3];

        //opposite is converting primitives to Strings
        String empNumStr = String.valueOf(empNum);

        System.out.println("Employee number: " + empNum);
        System.out.println("Employee name: " + name);
        System.out.println("Salaried? " + salaried);
        System.out.println("Date hired: " + date);
    }

    //Technique #1
    public static void readEmpRecord(Scanner reader) {
        int empNum =  reader.nextInt();
        String name = reader.next();
        boolean salaried = reader.nextBoolean();
        String date = reader.next();
        //LocalDate localDate = LocalDate.parse(date);

        System.out.println("Employee number: " + empNum);
        System.out.println("Employee name: " + name);
        System.out.println("Salaried? " + salaried);
        System.out.println("Date hired: " + date);
    }
}
