package program;

import objects.Bill;
import objects.Coin;
import objects.Dice;
import helpers.BillState;
import helpers.BillType;
import helpers.CoinType;
import interfaces.Randomizable;
import interfaces.Valuable;

public class TestInterfaces {
    public static void main(String[] args) {
        Coin favoriteCoin = new Coin(CoinType.QUARTER);

        //group objects based on the Randomizable interface
        Randomizable[] randoms = {
            new Dice(6, "red"),
            new Coin(CoinType.QUARTER),
            new Dice(20, "blue"),
            new Coin(CoinType.PENNY),
            favoriteCoin
        };

        for (int i = 0; i < randoms.length; i++) {
            randoms[i].randomize();
            System.out.println(randoms[i].getState());
        }

        //group objects based on the Valuable interface
        Valuable[] money = {
            new Coin(CoinType.QUARTER),
            new Coin(CoinType.DIME),
            new Coin(CoinType.PENNY),
            new Bill(BillType.TEN, BillState.MINT),
            new Bill(BillType.ONE, BillState.MINT),
            favoriteCoin
        };

        for (int i = 0; i < money.length; i++) {
            System.out.println("Value for coin or bill: " + money[i].getValue());
        }
    }

    public static void useRandom(Randomizable randomizable) {
        
    }
}
