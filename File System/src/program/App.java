package program;

import objects.Dice;

public class App {
    public static void main(String[] args) throws Exception {
        Dice myDice = new Dice(6, "red", 1);

        int numSides = myDice.sides();

        System.out.println("Number of sides is " + numSides);
        System.out.println(myDice.toString());
    }
}
