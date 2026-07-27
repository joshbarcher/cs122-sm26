package abstract_classes;

public class Headset extends PoweredDevice {
    private String name;
    private boolean surroundSound;
    private boolean headsetOn;

    public Headset(String name, boolean surroundSound, int watts) {
        super(watts);
        
        this.name = name;
        this.surroundSound = surroundSound;
    }

    public boolean poweredOn() {
        return headsetOn;
    }

    public void turnOn() {
        headsetOn = true;
    }

    public void turnOff() {
        headsetOn = false;
    }

    public String toString() {
        return name + " headset";
    }
}
