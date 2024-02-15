package command.receiver;

public class CeilingFan extends Location {
    public CeilingFan(String locationName) {
        super(locationName);
    }

    public void on() {
        System.out.println((locationName + " ceiling fan is on").trim());
    }

    public void off() {
        System.out.println((locationName + " ceiling fan is off").trim());
    }

}
