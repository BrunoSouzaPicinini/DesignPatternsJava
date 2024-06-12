package compoundpatterns;

public class DuckSimulator {

    public static void main(String[] args) {
        var simulator = new DuckSimulator();
        var duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        
        var redHeadDuck = duckFactory.createRedHeadDuck();
        var duckCall = duckFactory.createDuckCall();
        var rubberDuck = duckFactory.createRubberDuck();
        var gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: With Composite - Flocks");
        var flockOfDucks = new Flock();
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
        
        var mallardDuck = duckFactory.createMallardDuck();
        var mallardTwo = duckFactory.createMallardDuck();
        var mallardThree = duckFactory.createMallardDuck();
        var mallardFour = duckFactory.createMallardDuck();

        var flockOfMallards = new Flock();
        flockOfMallards.add(mallardDuck);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);
        
        var quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        System.out.println("\nDuck Simulator: Whole Flock Simulation");    
        
        simulate(flockOfDucks);
        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
