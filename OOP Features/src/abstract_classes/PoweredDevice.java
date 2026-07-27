package abstract_classes;

public abstract class PoweredDevice {
    private int watts;

    public PoweredDevice(int watts) {
        this.watts = watts;
    }

    public abstract boolean poweredOn();
    public abstract void turnOn();
    public abstract void turnOff();

    public void printWattage() {
        System.out.println("Watts are " + watts);
    }

    public String toString() {
        return "Device draws " + watts + " watts";
    }
}
