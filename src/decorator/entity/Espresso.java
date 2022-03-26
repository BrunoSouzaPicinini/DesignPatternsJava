package decorator.entity;

import java.math.BigDecimal;

public class Espresso extends Beverage {
    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(6.00);
    }
}
