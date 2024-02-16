package command;

import command.command.GarageDoorOpenCommand;
import command.command.LightOnCommand;
import command.invoker.SimpleRemoteControl;
import command.receiver.GarageDoor;
import command.receiver.Light;

public class MainClient {

    public static void main(String[] args) {
        var simpleUniversalRemoteControl = new SimpleRemoteControl();

        var lightOn = new LightOnCommand(new Light("Living Room"));

        simpleUniversalRemoteControl.setCommand(lightOn);
        simpleUniversalRemoteControl.buttonWasPressed();

        var garageDoorOpen = new GarageDoorOpenCommand(new GarageDoor(""));
        simpleUniversalRemoteControl.setCommand(garageDoorOpen);
        simpleUniversalRemoteControl.buttonWasPressed();
    }
}
