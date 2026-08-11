package reading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(new FileInputStream("files/employees.dat"))) {
            readEmpRecord(reader);
            readEmpRecord(reader);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error reading from file: " + ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("File format changed: " + ex.getMessage());
        }
    }

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
