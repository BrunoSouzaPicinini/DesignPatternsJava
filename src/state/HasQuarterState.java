package state;

public class HasQuarterState implements State{
    GumBallMachine gumBallMachine;

    public HasQuarterState(final GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumBallMachine.setState(gumBallMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        gumBallMachine.setState(gumBallMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "Has Quarter";
    }

}
