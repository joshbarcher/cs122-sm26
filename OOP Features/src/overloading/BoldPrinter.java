package overloading;

import java.awt.Color;

public class BoldPrinter extends Printer {
    
    //override any method that I want to replace in this class
    public void print(String msg) {
        System.out.println(msg.toUpperCase());
    }

    public void print(String msg, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(msg.toUpperCase());
        }
    }

    public void printColor(String msg, Color color) {
        System.out.println(msg + " - print in " + color);
    }
}
