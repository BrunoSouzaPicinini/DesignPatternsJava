package command.receiver;

public class Light extends Location{

    public Light(String locationName) {
        super(locationName);
    }

    public void on() {
        System.out.println((locationName + " Light is on").trim());
    }

    public void off() {
        System.out.println((locationName + " Light is off").trim());
    }
}
