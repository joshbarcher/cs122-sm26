package products;

/**
 * Represents a cup of coffee sold as a product.
 * 
 * @author Josh Archer
 * @version 1.0
 */
public class CupOfCoffee extends FoodProduct {
    private String beans;
    private boolean hot;

    public CupOfCoffee(String beans, boolean hot, String name, double price, int calories) {
        super(name, price, calories); //call the parent constructor

        this.beans = beans;
        this.hot = hot;
    }

    public String getBeans() {
        return beans;
    }

    public boolean isHot() {
        return hot;
    }

    public String toString() {
        return "Cup of coffee - " + beans + " $" + super.getPrice();
    }
}
