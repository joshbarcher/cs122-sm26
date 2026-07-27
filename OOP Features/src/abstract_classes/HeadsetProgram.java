package abstract_classes;

public class HeadsetProgram {
    public static void main(String[] args) {
        Arctis arctis = new Arctis("Arctis Nova", true, 15);

        //Headset headset = new Headset("Arctis Nova", true, 15);

        //this is not possible!
        //PoweredDevice genericDevice = new PoweredDevice(100);
        //genericDevice.turnOn();

        arctis.turnOn();
        System.out.println("Is the headset on? " + arctis.poweredOn());
    }
}
