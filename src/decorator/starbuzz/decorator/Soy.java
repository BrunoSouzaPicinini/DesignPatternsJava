package decorator.starbuzz.decorator;

import decorator.starbuzz.model.Beverage;

public class Soy extends CondimentDecorator {

        Beverage beverage;

        public Soy(Beverage beverage) {
            this.beverage = beverage;
        }

        public String getDescription() {
            return beverage.getDescription() + ", Soy";
        }

        public double cost() {
            return switch (beverage.getSize()) {
                case VENTI -> 0.15d + beverage.cost();
                case GRANDE -> 0.12d + beverage.cost();
                default -> 0.10d + beverage.cost();
            };
        }

}
