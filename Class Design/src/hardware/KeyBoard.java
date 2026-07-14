package hardware;

public class KeyBoard {
    //encapsulate our fields (hide them on purpose)
    private boolean mechanical;   //false
    private boolean rgb;          //false
    private String type;          //logitech, corsair, generic...
    private int size;             //a positive number, or in the range [8, 32]      

    //this is a "constructor" method, used to create an instance of a class
    public KeyBoard(boolean mechanical, boolean rgb, String type, int size) {
        //assign fields to the parameters passed in
        this.mechanical = mechanical;
        this.rgb = rgb;
        this.type = type;
        this.size = size;
    }

    //this is a default constructor
    public KeyBoard() {
        type = "Generic";
        size = 12;
    }

    //getters (aka accessors)
    public boolean isMechanical() {
        return mechanical;
    }

    public int getSize() {  //conventional naming here...
        return size;
    }

    public String getType() {
        String convertedType = type.toUpperCase();
        return convertedType;
    }

    public boolean getRGB() {
        return rgb;
    }

    //setters (aka mutator)
    public void setMechanical(boolean mechanical) {
        this.mechanical = mechanical;
    }

    public void setRGB(boolean rgb) {
        this.rgb = rgb;
    }

    public void setType(String type) {
        if (type == "Logitech" || type == "Corsair" || type == "Generic") {
            this.type = type;
        }
    }

    public void setSize(int size) {
        //check for bad inputs
        if (size < 8 || size > 32) {
            System.out.println("Invalid size detected - " + size + "!");
            return; //exit the method
        }

        this.size = size;
    }

    public String toString() {
        return "Keyboard: " + type + " (rgb: " + rgb + ")";
    }
}