package program;

import products.CupOfCoffee;
import products.Muffin;
import products.Bagel;

public class Program {
    public static void main(String[] args) {
        CupOfCoffee coffee = new CupOfCoffee("arabica", false);
        Muffin muffin = new Muffin();
        Bagel bagel = new Bagel();

        coffee.setPrice(6.0);
        muffin.buy();

        System.out.println(coffee.getBeans());
        System.out.println(coffee.getPrice());
    }
}
