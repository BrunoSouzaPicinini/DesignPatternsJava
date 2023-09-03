package factory.entity.chicago;

import factory.entity.Pizza;

public abstract class ChicagoStylePizza extends Pizza {

    public ChicagoStylePizza(String type) {
        this.name = "Chicago Style " +  (type == null ? "" : type + " ")  + "Pizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";
        this.toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
