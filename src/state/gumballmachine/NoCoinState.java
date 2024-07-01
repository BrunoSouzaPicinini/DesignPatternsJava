package state.gumballmachine;

public class NoCoinState implements State{
    GumBallMachine gumBallMachine;

    public NoCoinState(final GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    public void insertCoin() {
        System.out.println("You inserted a coin");
        gumBallMachine.setState(gumBallMachine.getHasCoinState());
    }

    public void ejectCoin() {
        System.out.println("You haven't inserted a coin");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no coin");
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
        return "No Coin";
    }

}
