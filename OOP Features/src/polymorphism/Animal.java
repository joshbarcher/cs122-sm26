package polymorphism;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeNoise() {
        System.out.println("Noise....");
    }
}
