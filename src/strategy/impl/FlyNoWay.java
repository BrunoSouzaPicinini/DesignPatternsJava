package strategy.impl;

import strategy.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Do not fly");
    }
}
