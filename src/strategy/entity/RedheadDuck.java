package strategy.entity;

import strategy.interfaces.FlyBehavior;
import strategy.interfaces.QuackBehavior;

public class RedheadDuck extends Duck {

    public RedheadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("Looks like a readhead");
    }
}
