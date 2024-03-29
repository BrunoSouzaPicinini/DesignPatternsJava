package command.command;

import command.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.openDoor();
    }

    public void undo() {
        garageDoor.closeDoor();
    }
}
