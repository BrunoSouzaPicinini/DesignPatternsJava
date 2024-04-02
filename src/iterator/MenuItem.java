package iterator;

import java.math.BigDecimal;

public record MenuItem (String name, String description, Boolean vegetarian, BigDecimal price){}