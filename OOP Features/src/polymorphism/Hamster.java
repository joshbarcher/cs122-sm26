package polymorphism;

public class Hamster extends Animal {
    private String color;

    public Hamster(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void makeNoise() {
        System.out.println("Squeek....");
    }
}
