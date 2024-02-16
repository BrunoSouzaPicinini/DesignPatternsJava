package command.invoker;

import command.command.Command;
import command.command.NoCommand;

public class RemoteControl {
    Command[] leftCommands;
    Command[] rightCommands;
    Command undoCommand;

    public RemoteControl() {
        leftCommands = new Command[7];
        rightCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            leftCommands[i] = noCommand;
            rightCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command leftCommand, Command rightCommand) {
        leftCommands[slot] = leftCommand;
        rightCommands[slot] = rightCommand;
    }

    public void leftButtonWasPushed(int slot) {
        leftCommands[slot].execute();
        undoCommand = leftCommands[slot];
    }

    public void rightButtonWasPushed(int slot) {
        rightCommands[slot].execute();
        undoCommand = rightCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control ------\n");
        for (int i = 0; i < leftCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + leftCommands[i].getClass().getName() + "    " + rightCommands[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuff.toString();
    }

}
