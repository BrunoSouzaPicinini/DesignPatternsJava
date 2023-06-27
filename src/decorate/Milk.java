package decorate;

import decorate.model.Beverage;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.10d + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
