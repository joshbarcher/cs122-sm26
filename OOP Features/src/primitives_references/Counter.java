package primitives_references;

public class Counter {
    private int number;

    public Counter() {
        number = 1;
    }

    public void increment() {
        number++;
    }

    public int getNumber() {
        return number;
    }
}
