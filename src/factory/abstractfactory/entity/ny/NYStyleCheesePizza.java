package factory.abstractfactory.entity.ny;

import factory.abstractfactory.entity.pizza.CheesePizza;
import factory.abstractfactory.ingredient.PizzaIngredientFactory;

public class NYStyleCheesePizza extends CheesePizza {

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
        this.name = "NY Style Cheese Pizza";
    }
}
