package state;

public class SoldOutState implements State{
    GumBallMachine gumBallMachine;

    public SoldOutState(final GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    public void refill(int gumballs) {
        if(gumballs < 0) {
            System.out.println("No gumballs to refill");
            return;
        }

        gumBallMachine.addGumballs(gumballs);
        gumBallMachine.setState(gumBallMachine.getNoQuarterState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "Sold Out";
    }

}
