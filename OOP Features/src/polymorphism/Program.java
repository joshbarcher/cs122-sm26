package polymorphism;

public class Program {
    public static void main(String[] args) {
        //this technique is called upcasting
        Animal[] animals = {
            new Cat("Ginny", true),
            new Dog("ChuChu", 28),
            new Hamster("Beer", "white and brown"),
            new PitBull("Terry", 5),
            new Cat("Lazarus", true)
        };

        for (int i = 0; i < animals.length; i++) {
            printAnimal(animals[i]);
        }
        System.out.println(); //new line

        Object[] objs = {
            new Dog("Fluffers", 12),
            new String("Hello"),
            "Hello from CS 122",
            new Spaceship(),
            new StringBuilder()
        };

        for (int i = 0; i < objs.length; i++) {
            print(objs[i]);
        }
    }

    public static void printAnimal(Animal animal) {
        animal.makeNoise();
        System.out.println(animal.getName() + " made a noise");
    }

    public static void print(Object object) {
        System.out.println(object.toString());
    }
}
