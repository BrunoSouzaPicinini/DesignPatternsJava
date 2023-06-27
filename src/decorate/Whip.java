package decorate;

import decorate.model.Beverage;

public class Whip extends CondimentDecorator {

        Beverage beverage;
        public Whip(Beverage beverage) {
            this.beverage = beverage;
        }

        public String getDescription() {
            return beverage.getDescription() + ", Whip";
        }

        public double cost() {
            return 0.10d + beverage.cost();
        }
}
