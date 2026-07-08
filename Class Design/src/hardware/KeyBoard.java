package hardware;

public class KeyBoard {
    //fields available to other classes in your folder
    private boolean mechanical;   //false
    private boolean rgb;          //false
    private String type;          
    private int size;             

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
        return type;
    }

    public void pressKey() {
        mechanical = true;
        //do something...
    }
}