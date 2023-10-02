package factory.abstractfactory.store;

import factory.abstractfactory.entity.ny.NYStyleCheesePizza;
import factory.abstractfactory.entity.ny.NYStyleClamPizza;
import factory.abstractfactory.entity.ny.NYStylePepperoniPizza;
import factory.abstractfactory.entity.ny.NYStyleVeggiePizza;
import factory.abstractfactory.entity.pizzas.Pizza;
import factory.abstractfactory.entity.pizzas.PizzaTypeEnum;
import factory.abstractfactory.ingredient.NYPizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(PizzaTypeEnum type) {
        var pizzaIngredientFactory = new NYPizzaIngredientFactory();
        return switch (type) {
            case CHEESE -> new NYStyleCheesePizza(pizzaIngredientFactory);
            case VEGGIE -> new NYStyleVeggiePizza(pizzaIngredientFactory);
            case CLAM -> new NYStyleClamPizza(pizzaIngredientFactory);
            case PEPPERONI -> new NYStylePepperoniPizza(pizzaIngredientFactory);
        };
    }
}
