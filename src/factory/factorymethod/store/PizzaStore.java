package factory.factorymethod.store;

import factory.factorymethod.entity.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // This is the factory method. It is abstract in the PizzaStore class
    // and implemented in the concrete subclasses.
    protected abstract Pizza createPizza(String type);
}
