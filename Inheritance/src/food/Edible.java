package food;

public class Edible {
    private boolean poison;

    //constructor - pass data into the object on creation
    public Edible(boolean poison) {
        this.poison = poison;
    }

    //allows me to read the data
    public boolean getPoison() {
        return poison;
    }

    //allows me to write/change the data
    public void setPoison(boolean poison) {
        this.poison = poison;
    }

    //converts the object to a string
    public String toString() {
        String poison = "";
        if (getPoison() == true) {
            poison = "poisonous";
        } else {
            poison = "non-poisonous";
        }

        return "A " + poison + " edible";
    }
}