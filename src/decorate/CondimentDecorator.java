package decorate;

import decorate.model.Beverage;

public abstract class CondimentDecorator extends Beverage {

        Beverage beverage;

        public abstract String getDescription();

        public double cost() {
            return 0d;
        }
}
