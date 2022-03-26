package decorator.entity;

import java.math.BigDecimal;

public class Decaf extends Beverage{
    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(5.00);
    }
}
