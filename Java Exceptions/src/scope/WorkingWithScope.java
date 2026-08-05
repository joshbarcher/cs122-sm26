package scope;

public class WorkingWithScope {
    private static String message = "";

    public static void main(String[] args) {

        boolean sunny = true;
        if (sunny) {
            message = "Go outside";
        } else {
            message = "Stay inside";
        }

        printMe();
    }

    public static void printMe() {
        System.out.println(message);
    }
}
