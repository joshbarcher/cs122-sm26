
import java.util.Scanner;

import game.measurements.Point;
import hardware.KeyBoard;

public class Program {
    public static void main(String[] args) {
        Point myPoint = new Point();
        myPoint.x = 10;
        myPoint.y = -6;
        myPoint.z = 12;

        //creating an object based on the class
        KeyBoard myKeys = new KeyBoard(true, true, "Logitech", 16);
        KeyBoard otherKeys = new KeyBoard(false, false, "built-in", 11);
        KeyBoard thirdKeys = new KeyBoard();

        if (myKeys.isMechanical() == true) {
            System.out.println("Cool, mechanical keyboards are nice to type on!");
        }

        System.out.println("The width of my keyboard is " + myKeys.getSize() + " inches");
        System.out.println("What type of keyboard is this? " + myKeys.getType());

        myKeys.pressKey();
    }

    public void otherMethod() {
        //this variable is not in scope
        //myKeys.isMechanical();
    }
}
