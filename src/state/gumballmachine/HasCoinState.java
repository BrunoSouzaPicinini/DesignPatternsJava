package state.gumballmachine;

import java.util.Random;

public class HasCoinState implements State{
    Random randomWinner = new Random(System.currentTimeMillis());

    GumBallMachine gumBallMachine;

    public HasCoinState(final GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    public void insertCoin() {
        System.out.println("You can't insert another coin");
    }

    public void ejectCoin() {
        System.out.println("Quarter returned");
        gumBallMachine.setState(gumBallMachine.getNoCoinState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumBallMachine.getCount() > 1)) {
            gumBallMachine.setState(gumBallMachine.getWinnerState());
            return;
        }
        gumBallMachine.setState(gumBallMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public void refill(int gumballs) {
        System.out.println("You can't refill now");
    }

    @Override
    public String toString() {
        return "Has Coin";
    }

}
