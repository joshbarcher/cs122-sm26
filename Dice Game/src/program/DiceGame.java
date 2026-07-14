package program;

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

        //game over, we need to declare a winner!
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("The game is a tie!");
        }
    }

    //one round in the game - an internal routine
    private void round(int roundNum) {
        //roll the dice
        player1.getDice().roll();
        player2.getDice().roll();

        int roll1 = player1.getDice().getSideUp();
        int roll2 = player2.getDice().getSideUp();

        System.out.println(player1.getName() + " rolls " + roll1 + ", " + 
                           player2.getName() + " rolls " + roll2);

        if (roll1 < roll2) {
            player2.changeScore(roll2);
            System.out.println(player2.getName() + " wins the round!");
        } else if (roll1 > roll2) {
            player1.changeScore(roll1);
            System.out.println(player1.getName() + " wins the round!");
        } else {
            System.out.println("Tie, no score change!");
        }

        //print out the round results
        System.out.println();
        System.out.println("Round #" + roundNum);
        System.out.println("---------------------------");
        System.out.println(player1.getName() + " Score: " + player1.getScore());
        System.out.println(player2.getName() + " Score: " + player2.getScore());
        System.out.println("---------------------------");
        System.out.println();
    }
}
