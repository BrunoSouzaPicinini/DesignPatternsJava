package factory.abstractfactory.entity.ny;

import factory.abstractfactory.entity.pizza.VeggiePizza;
import factory.abstractfactory.ingredient.PizzaIngredientFactory;

public class NYStyleVeggiePizza extends VeggiePizza {

    public NYStyleVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
        this.name = "NY Style Veggie Pizza";
    }
}
