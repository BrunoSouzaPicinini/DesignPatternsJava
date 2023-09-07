package factory.abstractfactory;

import factory.abstractfactory.entity.pizza.Pizza;
import factory.abstractfactory.entity.pizza.PizzaTypeEnum;
import factory.abstractfactory.store.ChicagoPizzaStore;
import factory.abstractfactory.store.NYPizzaStore;
import factory.abstractfactory.store.PizzaStore;

public class Main {

    public static void main(String... args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza;

        pizza = nyStore.orderPizza(PizzaTypeEnum.CHEESE);
        String who = "Ethan";
        placeAnOrder(who, pizza);

        pizza = nyStore.orderPizza(PizzaTypeEnum.CLAM);
        placeAnOrder(who, pizza);

        pizza = nyStore.orderPizza(PizzaTypeEnum.VEGGIE);
        placeAnOrder(who, pizza);
        pizza = nyStore.orderPizza(PizzaTypeEnum.PEPPERONI);
        placeAnOrder(who, pizza);

        who = "Joel";
        pizza = chicagoStore.orderPizza(PizzaTypeEnum.CHEESE);
        placeAnOrder(who, pizza);

        pizza = chicagoStore.orderPizza(PizzaTypeEnum.CLAM);
        placeAnOrder(who, pizza);

        pizza = chicagoStore.orderPizza(PizzaTypeEnum.VEGGIE);
        placeAnOrder(who, pizza);

        pizza = chicagoStore.orderPizza(PizzaTypeEnum.PEPPERONI);
        placeAnOrder(who, pizza);

    }

    private static void placeAnOrder(String who, Pizza pizza) {
        System.out.println(who + " ordered a " + pizza.getName());
        System.out.println("Ingredients used: " + pizza.usedIngredients());
        System.out.println();
    }
}
