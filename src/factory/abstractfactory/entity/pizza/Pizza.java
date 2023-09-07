package factory.abstractfactory.entity.pizza;

import factory.abstractfactory.entity.ingredient.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected List<Veggies> veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;
    protected ArrayList<String> toppings = new ArrayList<>();

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public String usedIngredients() {
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(dough);
        ingredients.add(sauce);
        ingredients.add(cheese);
        ingredients.add(pepperoni);
        ingredients.add(clam);

        if (veggies != null) {
            ingredients.addAll(veggies);
        }

        return ingredients.stream()
                .filter(Objects::nonNull)
                .map(Ingredient::getName)
                .reduce("", (acc, ingredientName) -> acc + ingredientName + ", ");
    }
}
