package strategy;

import strategy.entity.*;
import strategy.impl.*;
import strategy.interfaces.FlyBehavior;

import java.util.ArrayList;

public class Main {

    //The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
    //Strategy lets the algorithm vary independently of clients that use it.

    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList<>();

        Duck mallard = new MallardDuck(new FlyWithWings(), new Quack());
        Duck redhead = new RedheadDuck(new FlyWithWings(), new Quack());
        Duck rubber = new RubberDuck(new FlyNoWay(), new Squeak());
        Duck decoy = new DecoyDuck(new FlyNoWay(), new MuteQuack());
        ducks.add(mallard);
        ducks.add(redhead);
        ducks.add(rubber);
        ducks.add(decoy);

        performBehaviorsOfAllDucks(ducks);

        FlyBehavior flyWithAJetpack = () -> System.out.println("Fly with a jetpack");
        mallard.setFlyBehavior(flyWithAJetpack);
        redhead.setFlyBehavior(flyWithAJetpack);
        rubber.setFlyBehavior(flyWithAJetpack);
        decoy.setFlyBehavior(flyWithAJetpack);

        performBehaviorsOfAllDucks(ducks);
    }

    private static void performBehaviorsOfAllDucks(ArrayList<Duck> ducks) {
        ducks.forEach(duck -> {
            duck.display();
            duck.performFly();
            duck.performQuack();
            System.out.println("-----");
        });
    }
}
