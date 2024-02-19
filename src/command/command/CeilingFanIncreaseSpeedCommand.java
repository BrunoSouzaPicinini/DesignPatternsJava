package command.command;

import command.receiver.CeilingFan;

public class CeilingFanIncreaseSpeedCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanIncreaseSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.increase();
    }

    @Override
    public void undo() {
        ceilingFan.decrease();
    }
}
