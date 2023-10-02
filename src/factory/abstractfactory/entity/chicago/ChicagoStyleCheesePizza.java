package factory.abstractfactory.entity.chicago;

import factory.abstractfactory.entity.pizzas.CheesePizza;
import factory.abstractfactory.ingredient.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends CheesePizza {

    public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
        this.name = "Chicago Style Cheese Pizza";
        this.toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
