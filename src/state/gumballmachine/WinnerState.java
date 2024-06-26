package state.gumballmachine;

public class WinnerState implements State{
    GumBallMachine gumBallMachine;

    public WinnerState(final GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    public void insertCoin() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    public void ejectCoin() {
        System.out.println("Sorry, you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumballs for your coin");
        gumBallMachine.releaseBall();
        if (gumBallMachine.getCount() == 0) {
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
            return;
        }
        gumBallMachine.releaseBall();
        if( gumBallMachine.getCount() > 0) {
            gumBallMachine.setState(gumBallMachine.getNoCoinState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        }
    }

    public void refill(int gumballs) {
        System.out.println("You can't refill now");
    }
}
