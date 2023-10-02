package factory.abstractfactory.store;

import factory.abstractfactory.entity.pizzas.Pizza;
import factory.abstractfactory.entity.pizzas.PizzaTypeEnum;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaTypeEnum type) {
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
    protected abstract Pizza createPizza(PizzaTypeEnum type);
}
