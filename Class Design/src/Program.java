
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
        KeyBoard otherKeys = new KeyBoard(false, false, "Generic", 11);
        KeyBoard thirdKeys = new KeyBoard();

        if (myKeys.isMechanical() == true) {
            System.out.println("Cool, mechanical keyboards are nice to type on!");
        }

        myKeys.setSize(10000);
        myKeys.setType("Acme Inc");

        System.out.println("The width of my keyboard is " + myKeys.getSize() + " inches wide");
        System.out.println("What type of keyboard is this? " + myKeys.getType());

        System.out.println(myKeys.toString());
        System.out.println(otherKeys.toString());
    }

    
}
