package command.command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        //Do nothing
    }

    @Override
    public void undo() {
        //Do nothing
    }
}
