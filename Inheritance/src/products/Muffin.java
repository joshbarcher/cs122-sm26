package products;

public class Muffin extends FoodProduct {
    private String toppings;

    public Muffin(String toppings, String name, double price, int calories) {
        super(name, price, calories);

        this.toppings = toppings;
    }

    public String getToppings() {
        return toppings;
    }
}
