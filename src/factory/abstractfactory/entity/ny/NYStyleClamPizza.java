package factory.abstractfactory.entity.ny;

import factory.abstractfactory.entity.pizza.ClamPizza;
import factory.abstractfactory.ingredient.PizzaIngredientFactory;

public class NYStyleClamPizza extends ClamPizza {

    public NYStyleClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
        this.name = "NY Style Clam Pizza";
    }
}
