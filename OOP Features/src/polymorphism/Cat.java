package polymorphism;

public class Cat extends Animal {
    private boolean claws;

    public Cat(String name, boolean claws) {
        super(name);
        this.claws = claws;
    }

    public boolean getClaws() {
        return claws;
    }

    public void makeNoise() {
        System.out.println("Meow....");
    }
}
