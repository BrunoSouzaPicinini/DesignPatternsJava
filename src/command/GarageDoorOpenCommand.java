package command;

public class GarageDoorOpenCommand implements Command {

    Garage garage;

    public GarageDoorOpenCommand(Garage garage) {
        this.garage = garage;
    }

    public void execute() {
        garage.openDoor();
    }
}
