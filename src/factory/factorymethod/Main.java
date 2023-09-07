package factory.factorymethod;

import factory.factorymethod.entity.Pizza;
import factory.factorymethod.store.ChicagoPizzaStore;
import factory.factorymethod.store.NYPizzaStore;
import factory.factorymethod.store.PizzaStore;

public class Main {

    public static void main(String... args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
