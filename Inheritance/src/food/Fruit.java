package food;

public class Fruit extends Edible {
    private String color;

    public Fruit(String color, boolean poison) {
        super(poison);

        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void peel() {
        System.out.println("You peel the fruit");
    }

    public String toString() {

        //call the parent toString()
        String edibleString = super.toString();
        return edibleString + " - a " + color + " fruit";
    }
}
