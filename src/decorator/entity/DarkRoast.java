package decorator.entity;

import java.math.BigDecimal;

public class DarkRoast extends Beverage {
    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(10.50);
    }
}
