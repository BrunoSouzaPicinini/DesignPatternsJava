package state;

public class GumBallMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State state;
    State winnerState;
    int count;

    public GumBallMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        state = soldOutState;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void setState(final State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count--;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    public void addGumballs(final int gumballs) {
        System.out.println(gumballs + " gumball(s) added");
        count += gumballs;
    }

    public void refill(int gumballs) {
        state.refill(gumballs);
    }

    @Override
    public String toString() {
        return "GumBallMachine{" +
            "state=" + state +
            ", count=" + count +
            '}';
    }

}
