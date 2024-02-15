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

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);

    }
}
