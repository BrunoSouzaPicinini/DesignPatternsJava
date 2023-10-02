package factory.abstractfactory.ingredient;

import factory.abstractfactory.entity.ingredients.*;
import factory.abstractfactory.entity.ingredients.Spinach;

import java.util.List;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clam createClam() {
        return new FrozenClams();
    }

    @Override
    public List<Veggies> createVeggies() {
        return List.of(new BlackOlives(), new Spinach(), new Eggplant());
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
