package polymorphism;

public class Dog extends Animal {
    private int dogYears;

    public Dog(String name, int dogYears) {
        super(name);
        this.dogYears = dogYears;
    }

    public int getDogYears() {
        return dogYears;
    }
}
