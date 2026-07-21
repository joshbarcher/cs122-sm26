package food;

public class Apple extends Fruit {
    private String type;

    public Apple(String type, String color, boolean poison) {
        super(color, poison);

        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void peel() {
        System.out.println("You peel the apple");
        System.out.println("Yummm!");
    }

    public String toString() {

        String fruitString = super.toString();
        return fruitString + " - a " + type + " apple!";
    }
}
