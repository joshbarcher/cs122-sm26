package products;

//this class automatically inherits from Object
public class FoodProduct {
    private String name;
    private double price;
    private int calories;

    public FoodProduct(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public void buy() {

    }

    public void addStock(int num) {

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Product: " + name + " $" + price;
    }
}
