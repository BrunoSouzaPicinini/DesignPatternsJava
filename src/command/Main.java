package command;

public class Main {

    public static void main(String[] args) {
        var remote = new SimpleRemoteControl();

        var light = new Light();
        var lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        var garage = new Garage();
        var garageDoorOpen = new GarageDoorOpenCommand(garage);
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();

    }
}
