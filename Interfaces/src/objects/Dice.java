package objects;

import java.util.Random;

import interfaces.Randomizable;

public class Dice implements Randomizable {
    private int sides;
    private String color;
    private int sideUp;

    public Dice(int sides, String color) {
        this.sides = sides;
        this.color = color;
    }

    public void gamble() {
        
    }

    public void randomize() {
        Random random = new Random();
        sideUp = random.nextInt(1, sides + 1);
    }

    public String getState() {
        return String.valueOf(sideUp);   
    }

    public String toString() {
        return "A " + sides + " sided die";
    }
}
