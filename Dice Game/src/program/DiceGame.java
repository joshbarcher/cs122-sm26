package program;

import game.Dice;
import game.Player;

public class DiceGame {
    //this is an example of a constant variable
    private static final int NUM_ROUNDS = 5;

    private Player player1;
    private Player player2;

    public DiceGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    //the full game
    public void playGame() {
        for (int i = 1; i <= NUM_ROUNDS; i++) {
            round(i);
        }
    }

    //one round in the game
    public void round(int roundNum) {
        //roll the dice
        player1.getDice().roll();
        player2.getDice().roll();

        int roll1 = player1.getDice().getSideUp();
        int roll2 = player2.getDice().getSideUp();

        System.out.println("P1 rolls " + roll1 + ", P2 rolls " + roll2);

        if (roll1 < roll2) {
            player2.changeScore(roll2);
            System.out.println("Player 2 wins the round!");
        } else if (roll1 > roll2) {
            player1.changeScore(roll1);
            System.out.println("Player 1 wins the round!");
        } else {
            System.out.println("Tie, no score change!");
        }

        //print out the round results
        System.out.println();
        System.out.println("Round #" + roundNum);
        System.out.println("---------------------------");
        System.out.println("P1 Score: " + player1.getScore());
        System.out.println("P2 Score: " + player2.getScore());
        System.out.println("---------------------------");
        System.out.println();
    }
}
