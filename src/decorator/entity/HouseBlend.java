package decorator.entity;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {
    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(9.30);
    }
}
