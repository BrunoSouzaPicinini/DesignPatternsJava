package factory.abstractfactory.store;

import factory.abstractfactory.entity.chicago.ChicagoStyleCheesePizza;
import factory.abstractfactory.entity.chicago.ChicagoStyleClamPizza;
import factory.abstractfactory.entity.chicago.ChicagoStylePepperoniPizza;
import factory.abstractfactory.entity.chicago.ChicagoStyleVeggiePizza;
import factory.abstractfactory.entity.pizzas.Pizza;
import factory.abstractfactory.entity.pizzas.PizzaTypeEnum;
import factory.abstractfactory.ingredient.ChicagoPizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaTypeEnum type) {
        var pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        return switch (type) {
            case CHEESE -> new ChicagoStyleCheesePizza(pizzaIngredientFactory);
            case VEGGIE -> new ChicagoStyleVeggiePizza(pizzaIngredientFactory);
            case CLAM -> new ChicagoStyleClamPizza(pizzaIngredientFactory);
            case PEPPERONI -> new ChicagoStylePepperoniPizza(pizzaIngredientFactory);
        };
    }
}
