package command.receiver;

public class GarageDoor extends Location {

    public GarageDoor(String locationName) {
        super(locationName);
    }

    public void openDoor() {
        System.out.println((locationName + " Garage door is open").trim());
    }

    public void closeDoor() {
        System.out.println((locationName + " Garage door is closed").trim());
    }
}
