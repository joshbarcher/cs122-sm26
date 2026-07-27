package polymorphism;

public class Program {
    public static void main(String[] args) {
        //these variables can only access members in Animal
        Animal cat = new Cat("Ginny", true);
        Animal dog = new Dog("ChuChu", 28);
        Animal hamster = new Hamster("Beer", "white and brown");

        // System.out.println("Cat: " + cat.getName());
        // System.out.println("Dog: " + dog.getName());

        printAnimal(cat);
        printAnimal(dog);
        printAnimal(hamster);
    }

    public static void printAnimal(Animal animal) {
        animal.makeNoise();
        System.out.println(animal.getName() + " made a noise");
    }
}
