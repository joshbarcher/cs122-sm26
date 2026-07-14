package program;

import products.CupOfCoffee;
import products.Muffin;
import products.Bagel;

public class Program {
    public static void main(String[] args) {
        CupOfCoffee coffee = new CupOfCoffee();
        Muffin muffin = new Muffin();
        Bagel bagel = new Bagel();

        muffin.buy();

        System.out.println(coffee.name);
        System.out.println(muffin.price);
    }
}
