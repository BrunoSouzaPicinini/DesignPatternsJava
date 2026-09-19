package strategy.impl;

import strategy.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Voando com asas");
    }
}
