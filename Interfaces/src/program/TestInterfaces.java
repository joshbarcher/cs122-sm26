package program;

import objects.Coin;
import objects.Dice;
import interfaces.Randomizable;

public class TestInterfaces {
    public static void main(String[] args) {
        // Randomizable dice = new Dice(6, "red");
        // Randomizable coin = new Coin("Quarter");

        Randomizable[] randoms = {
            new Dice(6, "red"),
            new Coin("Quarter"),
            new Dice(20, "blue"),
            new Coin("Dime")
        };

        for (int i = 0; i < randoms.length; i++) {
            randoms[i].randomize();
            System.out.println(randoms[i].getState());
        }

        // dice.randomize();
        // coin.randomize();

        // System.out.println("Dice is " + dice.getState());
        // System.out.println("Coin is " + coin.getState());
    }
}
