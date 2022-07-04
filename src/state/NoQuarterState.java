package state;

public class NoQuarterState implements State{
    GumBallMachine gumBallMachine;

    public NoQuarterState(final GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumBallMachine.setState(gumBallMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public String toString() {
        return "No Quarter";
    }

}
