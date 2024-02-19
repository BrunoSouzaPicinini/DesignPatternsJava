package command.command;

import command.receiver.CeilingFan;

public class CeilingFanDecreaseSpeedCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanDecreaseSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.decrease();
    }

    @Override
    public void undo() {
        ceilingFan.increase();
    }
}
