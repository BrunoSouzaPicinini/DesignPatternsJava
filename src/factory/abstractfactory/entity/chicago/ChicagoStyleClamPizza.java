package factory.abstractfactory.entity.chicago;

import factory.abstractfactory.entity.pizzas.ClamPizza;
import factory.abstractfactory.ingredient.PizzaIngredientFactory;

public class ChicagoStyleClamPizza extends ClamPizza {

    public ChicagoStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
        this.name = "Chicago Style Clam Pizza";
        this.toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
