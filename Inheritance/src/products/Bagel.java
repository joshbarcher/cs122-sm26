package products;

public class Bagel extends FoodProduct {
    private String type;

    public Bagel(String type, String name, double price, int calories) {
        super(name, price, calories);

        this.type = type;
    }

    public String getType() {
        return type;
    }
}
