package factory.abstractfactory.entity.chicago;

import factory.abstractfactory.entity.pizzas.PepperoniPizza;
import factory.abstractfactory.ingredient.PizzaIngredientFactory;

public class ChicagoStylePepperoniPizza extends PepperoniPizza {

    public ChicagoStylePepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
        this.name = "Chicago Style Pepperoni Pizza";
        this.toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
