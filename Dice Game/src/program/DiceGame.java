package program;

import game.Dice;
import game.Player;

public class DiceGame {
    public static void main(String[] args) {
        Dice dice = new Dice(6);
        Player josh = new Player("Josh", dice);

        dice.roll();

        System.out.println(dice.toString());
    }
}
