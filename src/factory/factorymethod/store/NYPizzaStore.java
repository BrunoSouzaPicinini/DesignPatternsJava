package factory.factorymethod.store;

import factory.factorymethod.entity.*;
import factory.factorymethod.entity.ny.NYStyleCheesePizza;
import factory.factorymethod.entity.ny.NYStyleClamPizza;
import factory.factorymethod.entity.ny.NYStylePepperoniPizza;
import factory.factorymethod.entity.ny.NYStyleVeggiePizza;

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
