package decorator.entity;

import java.math.BigDecimal;

public abstract class Beverage {
    public String description;

    public String getDescription() {
        return this.description;
    }

    public abstract BigDecimal cost();
}
