package decorator;

import decorator.entity.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var beverages = new ArrayList<Beverage>();
        beverages.add(new DarkRoast());
        beverages.add(new Decaf());
        beverages.add(new Espresso());
        beverages.add(new HouseBlend());

        beverages.forEach(beverage -> System.out.println("This beverage cost %.2f".formatted(beverage.cost())));
    }
}
