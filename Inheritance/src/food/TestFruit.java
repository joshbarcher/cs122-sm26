package food;

public class TestFruit {
    public static void main(String[] args) {
        //very generic, abstract, unspecified
        Edible mushroom = new Edible(true);

        System.out.println(mushroom);

        //more specific
        Fruit pineapple = new Fruit("yellow", false);

        System.out.println(pineapple);

        Apple apple = new Apple("Red Delicious", "red", false);

        System.out.println(apple.toString());

        //can I call peel() on an apple object?
        apple.peel();
    }
}
