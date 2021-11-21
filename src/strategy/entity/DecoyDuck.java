package strategy.entity;

import strategy.interfaces.FlyBehavior;
import strategy.interfaces.QuackBehavior;

public class DecoyDuck extends Duck {

    public DecoyDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("Looks like a decoy duck");
    }
}
