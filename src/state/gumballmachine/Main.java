package state.gumballmachine;

public class Main {

    public static void main(String[] args) {
        var gumballMachine = new GumBallMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertCoin();
        gumballMachine.ejectCoin();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
        gumballMachine.ejectCoin();

        System.out.println(gumballMachine);

        gumballMachine.insertCoin();
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.refill(1);
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        gumballMachine.refill(2);
        gumballMachine.insertCoin();
        gumballMachine.refill(3);
        gumballMachine.turnCrank();
        gumballMachine.refill(4);

        System.out.println(gumballMachine);

    }
}
