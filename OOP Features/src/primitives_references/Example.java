package primitives_references;

public class Example {
    public static void main(String[] args) {
        //passing around primitives
        int num1 = 20;
        int num2 = num1;

        num1 += 10;
        num2 += 50;

        System.out.println("Number #1 " + num1);
        System.out.println("Number #2 " + num2);

        //passing around objects
        Counter counter1 = new Counter();  //inside of counter1 is the mem address of an object
        Counter counter2 = counter1;       //inside of counter2 is the mem address of the same object (copied over)    

        for (int i = 1; i <= 5; i++) {
            counter1.increment();
        }

        for (int i = 1; i <= 10; i++) {
            counter2.increment();
        }

        int num3 = counter1.getNumber();
        num3++;
        System.out.println("Number #3 " + num3);

        System.out.println("Count #1 " + counter1.getNumber());
        System.out.println("Count #2 " + counter2.getNumber());

        //String class is a class and not a primitive
        String name = "Josh";
        String otherName = new String("Tam");
        
    }
}
