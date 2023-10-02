package factory.abstractfactory.entity.chicago;

import factory.abstractfactory.entity.pizzas.VeggiePizza;
import factory.abstractfactory.ingredient.PizzaIngredientFactory;

public class ChicagoStyleVeggiePizza extends VeggiePizza {

    public ChicagoStyleVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
        this.name = "Chicago Style Veggie Pizza";
        this.toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
