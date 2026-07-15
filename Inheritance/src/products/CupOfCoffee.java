package products;

//borrow all public fields + methods from FoodProduct
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
}