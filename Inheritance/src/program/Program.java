package program;

import products.CupOfCoffee;
import products.Muffin;
import products.Bagel;

public class Program {
    public static void main(String[] args) {
        CupOfCoffee coffee = new CupOfCoffee("arabica", false, "Cold Mocha", 6.0, 300);
        CupOfCoffee anotherCup = new CupOfCoffee("generic", true, "Black Coffee", 4.0, 100);
        
        Muffin muffin = new Muffin();
        Bagel bagel = new Bagel();

        //coffee.setPrice(6.0);
        muffin.buy();

        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());

        System.out.println(anotherCup.getName());
        System.out.println(anotherCup.getPrice());
    }
}
