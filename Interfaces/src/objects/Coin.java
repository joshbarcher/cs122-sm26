package objects;

import java.util.Random;

import helpers.CoinType;
import interfaces.Randomizable;
import interfaces.Valuable;

public class Coin implements Randomizable, Valuable {
    private boolean state; //heads = true, tails = false
    private CoinType type;
    private double value;

    public Coin(CoinType type) {
        this.type = type;
        state = true; //start out with heads up

        if (type == CoinType.QUARTER) {
            value = .25;
        } else if (type == CoinType.DIME) {
            value = .10;
        } else if (type == CoinType.NICKEL) {
            value = .05;
        } else {
            value = .01;
        }
    }

    public double getValue() {
        return value;
    }

    public boolean isDigital() {
        return false;
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

    public void spend() {
        
    }

    public String toString() {
        return "A " + type + " coin";
    }
}