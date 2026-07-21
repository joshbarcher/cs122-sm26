package overloading;

public class Example {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print();
        printer.print("Hello, world!");
        printer.print("Hello, class, how are you?", 10);

        BoldPrinter boldPrinter = new BoldPrinter();

        boldPrinter.print("Hello, from the bold printer!");
        boldPrinter.print("Hello", 3);
        boldPrinter.print();
    }
}
