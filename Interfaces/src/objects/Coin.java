package objects;

import java.util.Random;

import interfaces.Randomizable;

public class Coin implements Randomizable {
    private boolean state; //heads = true, tails = false
    private String type;

    public Coin(String type) {
        this.type = type;
        state = true; //start out with heads up
    }

    public void spend() {
        
    }

    public void randomize() {
        //pick a new coin side "up"
        Random random = new Random();
        state = random.nextBoolean();
    }

    public String getState() {
        String coinSide = "";
        if (state) {
            coinSide = "heads";
        } else {
            coinSide = "tails";
        }
        return coinSide;
    }

    public String toString() {
        return "A " + type + " coin";
    }
}