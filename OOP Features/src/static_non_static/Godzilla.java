package static_non_static;

public class Godzilla {
    //instance members - instance fields are unique per object
    private String type;
    private boolean healthy;
    private static String origin = "Sea Creature";

    public Godzilla(String type, boolean healthy) {
        this.type = type;
        this.healthy = healthy;
    }

    public String getType() {
        return type;
    }

    //static method
    public static void setOrigin(String newOrigin) {
        origin = newOrigin;

        //access static fields
        //System.out.println(type);   //non-static
        System.out.println(origin); //static

        //can you access non-static methods in a static method
        //stomp();
    }

    //instance method
    public void stomp() {
        System.out.println("Godzilla stomps!");

        //access static or non-static fields
        System.out.println(type);   //non-static
        System.out.println(origin); //static
    }

    public String toString() {
        return type + " Godzilla, healthy? " + healthy + ", origin = " + origin;
    }
}
