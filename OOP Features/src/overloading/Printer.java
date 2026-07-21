package overloading;

public class Printer {

    //nothing much here....
    public Printer() {

    }

    public void print(String msg) {
        System.out.println(msg);
    }

    public void print() {
        System.out.println("Hello");
    }

    public void print(String msg, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(msg);
        }
    }
}
