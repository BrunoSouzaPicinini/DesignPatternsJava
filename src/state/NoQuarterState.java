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

    public void refill(int gumballs) {
        if(gumballs < 0) {
            System.out.println("No gumballs to refill");
            return;
        }

        gumBallMachine.addGumballs(gumballs);
    }

    @Override
    public String toString() {
        return "No Quarter";
    }

}
