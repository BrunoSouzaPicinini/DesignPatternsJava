package factory.abstractfactory.ingredient;

import factory.abstractfactory.entity.ingredient.*;

import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clam createClam() {
        return new FreshClams();
    }

    @Override
    public List<Veggies> createVeggies() {
        return List.of(new Garlic(), new Onion(), new Mushroom(), new RedPepper());

    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
