package state;

public abstract class GumballMachine {

    abstract void insertsQuarter();
    abstract void turnCrank();
    abstract void ejectsQuarter();
    protected abstract void dispense();

}
