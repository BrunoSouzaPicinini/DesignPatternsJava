package decorator.starbuzz.decorator;

import decorator.starbuzz.model.Beverage;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.20d + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
