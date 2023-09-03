package factory.store;

import factory.entity.*;
import factory.entity.ny.NYStyleCheesePizza;
import factory.entity.ny.NYStyleClamPizza;
import factory.entity.ny.NYStylePepperoniPizza;
import factory.entity.ny.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "veggie" -> new NYStyleVeggiePizza();
            case "clam" -> new NYStyleClamPizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            default -> null;
        };
    }
}
