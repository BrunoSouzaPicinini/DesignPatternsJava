package factory.factorymethod.entity.ny;

import factory.factorymethod.entity.Pizza;

public abstract class NYStylePizza extends Pizza {

    public NYStylePizza(String type) {
        this.name = "NY Style " +  (type == null ? "" : type + " ")  + "Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
