package factory.factorymethod.store;

import factory.factorymethod.entity.*;
import factory.factorymethod.entity.chicago.ChicagoStyleCheesePizza;
import factory.factorymethod.entity.chicago.ChicagoStyleClamPizza;
import factory.factorymethod.entity.chicago.ChicagoStylePepperoniPizza;
import factory.factorymethod.entity.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            default -> null;
        };
    }
}
