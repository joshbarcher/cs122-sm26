package program;

import game.Dice;
import game.Player;

public class Main {
    public static void main(String[] args) {
        Dice dice1 = new Dice(6);
        Player josh = new Player("Josh", dice1);

        Dice dice2 = new Dice(6);
        Player deacon = new Player("Deacon", dice2);

        DiceGame game = new DiceGame(josh, deacon);
        game.playGame();
    }
}
