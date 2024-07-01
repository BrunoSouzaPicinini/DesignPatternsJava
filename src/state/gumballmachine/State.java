package state.gumballmachine;

public interface State {

    void insertCoin();
    void ejectCoin();
    void turnCrank();
    void dispense();
    void refill(int gumballs);
}
