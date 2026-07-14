package program;

import game.Dice;
import game.Player;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice(6);
        Player josh = new Player("Josh", dice);

        josh.getDice().roll();

        System.out.println(dice.toString());
    }
}
