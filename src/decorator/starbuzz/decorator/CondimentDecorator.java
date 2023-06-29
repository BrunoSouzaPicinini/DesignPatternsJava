package decorator.starbuzz.decorator;

import decorator.starbuzz.model.Beverage;

public abstract class CondimentDecorator extends Beverage {

        public abstract String getDescription();

        public double cost() {
            return 0d;
        }
}
