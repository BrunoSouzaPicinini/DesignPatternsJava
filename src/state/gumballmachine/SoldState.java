package state.gumballmachine;

public class SoldState implements State{
    GumBallMachine gumBallMachine;

    public SoldState(final GumBallMachine gumBallMachine) {
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

    public void refill(int gumballs) {
        System.out.println("You can't refill now");
    }

    public void dispense() {
        gumBallMachine.releaseBall();
        if( gumBallMachine.getCount() > 0) {
            gumBallMachine.setState(gumBallMachine.getNoCoinState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        }
    }

}
