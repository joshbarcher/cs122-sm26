package game;

import java.util.Random;

public class Dice {
    //fields
    private int numSides; //4, 6, 8, 10, 12, 20
    private int sideUp;   //which side is up?

    //constructors
    public Dice(int numSides) {
        this.numSides = numSides;
        sideUp = 1; //default side up is one for all types of dice
    }

    //methods
    public void roll() {
        Random random = new Random();
        int randNumber = random.nextInt(numSides) + 1;
        sideUp = randNumber;
    }

    //readonly, the only way to change the side up is by rolling
    public int getNumSides() {
        return numSides;
    }

    public int getSideUp() {
        return sideUp;
    }

    public String toString() {
        return "The " + numSides + " sided dice, side up is " + sideUp;
    }
}
