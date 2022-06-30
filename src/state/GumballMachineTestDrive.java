package state;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        var gumballMachine = new GumBallMachineImpl(5);

        System.out.println(gumballMachine);

        gumballMachine.insertsQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertsQuarter();
        gumballMachine.ejectsQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertsQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertsQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectsQuarter();

        System.out.println(gumballMachine);

        gumballMachine.insertsQuarter();
        gumballMachine.insertsQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertsQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertsQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

    }
}
