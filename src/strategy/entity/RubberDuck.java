package strategy.entity;

import strategy.interfaces.FlyBehavior;
import strategy.interfaces.QuackBehavior;

public class RubberDuck extends Duck {

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("looks like a rubberduck");
    }
}
