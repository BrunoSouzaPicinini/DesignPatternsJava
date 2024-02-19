package command;

import command.command.*;
import command.invoker.RemoteControl;
import command.receiver.CeilingFan;
import command.receiver.GarageDoor;
import command.receiver.Light;
import command.receiver.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {
        var remoteControl = new RemoteControl();

        var livingRoomLight = new Light("Living Room");
        var kichenLight = new Light("Kitchen");
        var ceilingFan = new CeilingFan("Living Room");
        var garageDoor = new GarageDoor("");
        var stereo = new Stereo("Living Room");

        var livingRoomLightON = new LightOnCommand(livingRoomLight);
        var livingRoomLightOFF = new LightOffCommand(livingRoomLight);
        var kitchenLightON = new LightOnCommand(kichenLight);
        var kitchenLightOFF = new LightOffCommand(kichenLight);

        var ceilingFanON = new CeilingFanOnCommand(ceilingFan);
        var ceilingFanOFF = new CeilingFanOffCommand(ceilingFan);

        var garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        var garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        var stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        var stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightON, livingRoomLightOFF);
        remoteControl.setCommand(1, kitchenLightON, kitchenLightOFF);
        remoteControl.setCommand(2, ceilingFanON, ceilingFanOFF);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, garageDoorOpen, garageDoorClose);

        System.out.println("First scenario: all buttons were pushed.");

        System.out.println(remoteControl);
        remoteControl.leftButtonWasPushed(0);
        remoteControl.rightButtonWasPushed(0);
        remoteControl.leftButtonWasPushed(1);
        remoteControl.rightButtonWasPushed(1);
        remoteControl.leftButtonWasPushed(2);
        remoteControl.rightButtonWasPushed(2);
        remoteControl.leftButtonWasPushed(3);
        remoteControl.rightButtonWasPushed(3);
        remoteControl.leftButtonWasPushed(4);
        remoteControl.rightButtonWasPushed(4);

        System.out.println("\nSecond scenario: undo button was pushed.");

        remoteControl.leftButtonWasPushed(0);
        remoteControl.rightButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.rightButtonWasPushed(0);
        remoteControl.leftButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        System.out.println("\nThird scenario: set speed of ceiling fan.");
        var ceilingFanIncreaseSpeed = new CeilingFanIncreaseSpeedCommand(ceilingFan);
        var ceilingFanDecreaseSpeed = new CeilingFanDecreaseSpeedCommand(ceilingFan);
        remoteControl.setCommand(5, ceilingFanIncreaseSpeed, ceilingFanDecreaseSpeed);

        remoteControl.leftButtonWasPushed(5);
        remoteControl.leftButtonWasPushed(5);
        remoteControl.leftButtonWasPushed(5);
        remoteControl.leftButtonWasPushed(5);
        remoteControl.rightButtonWasPushed(5);
        remoteControl.rightButtonWasPushed(5);
        remoteControl.rightButtonWasPushed(5);
        remoteControl.rightButtonWasPushed(5);
        remoteControl.leftButtonWasPushed(5);
        remoteControl.rightButtonWasPushed(5);

        System.out.println("\nFourth scenario: macro commands.");
        Command[] allOn = {livingRoomLightON, kitchenLightON, ceilingFanON, stereoOnWithCD};
        Command[] allOff = {livingRoomLightOFF, kitchenLightOFF, ceilingFanOFF, stereoOff};

        MacroCommand macroAllOn = new MacroCommand(allOn);
        MacroCommand macroAllOff = new MacroCommand(allOff);
        remoteControl.setCommand(6, macroAllOn, macroAllOff);
        remoteControl.leftButtonWasPushed(6);
        remoteControl.rightButtonWasPushed(6);
    }
}
