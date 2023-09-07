package factory.abstractfactory.ingredient;

import factory.abstractfactory.entity.ingredient.*;

import java.util.List;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clam createClam();
    List<Veggies> createVeggies();
    Pepperoni createPepperoni();
}
