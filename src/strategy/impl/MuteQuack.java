package strategy.impl;

import strategy.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("¡No puede hacer cuac!");
    }
}
