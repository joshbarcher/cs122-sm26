package objects;

public class Hat {
    private String messageIcon;
    private String material;
    private boolean worn;

    public Hat() {

    }

    public Hat(String messageIcon, String material, boolean worn) {
        this.messageIcon = messageIcon;
        this.material = material;
        this.worn = worn;
    }

    public String getMessageIcon() {
        return messageIcon;
    }
    public void setMessageIcon(String messageIcon) {
        this.messageIcon = messageIcon;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public boolean isWorn() {
        return worn;
    }
    public void setWorn(boolean worn) {
        this.worn = worn;
    }

    public String toString() {
        return "Hat [messageIcon=" + messageIcon + ", material=" + material + ", worn=" + worn + "]";
    }
}
