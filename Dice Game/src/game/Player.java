package game;

public class Player {
    private String name;
    private int score;
    private Dice dice;   //example of "Composition"

    public Player(String name, Dice dice) {
        this.name = name;
        this.dice = dice;
        //score starts out at zero!
    }

    public void changeScore(int value) {

    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Dice getDice() {
        return dice;
    }
}
