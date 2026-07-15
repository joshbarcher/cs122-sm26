package program;

import products.CupOfCoffee;
import products.Muffin;
import products.Bagel;

public class Program {
    public static void main(String[] args) {
        CupOfCoffee coffee = new CupOfCoffee("arabica", false, "Cold Mocha", 6.0, 300);
        CupOfCoffee anotherCup = new CupOfCoffee("generic", true, "Black Coffee", 4.0, 100);

        Muffin muffin = new Muffin("Cinnamon", "Coffee Cake Muffin", 3.00, 500);
        Bagel bagel = new Bagel("Plain", "Plain Bagel", 1.00, 300);

        coffee.

        //coffee.setPrice(6.0);
        muffin.buy();

        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());

        System.out.println(anotherCup.getName());
        System.out.println(anotherCup.getPrice());

        System.out.println("Toppings on muffin are " + muffin.getToppings());

        System.out.println(muffin.toString());
        System.out.println(coffee.toString());
    }
}
