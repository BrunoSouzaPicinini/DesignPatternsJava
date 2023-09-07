package factory.abstractfactory.entity.ny;

import factory.abstractfactory.entity.pizza.PepperoniPizza;
import factory.abstractfactory.ingredient.PizzaIngredientFactory;

public class NYStylePepperoniPizza extends PepperoniPizza {

    public NYStylePepperoniPizza(PizzaIngredientFactory pizaIngredientFactory) {
        super(pizaIngredientFactory);
        this.name = "NY Style Pepperoni Pizza";
    }
}
