package decorator.starbuzz;

import decorator.starbuzz.decorator.Milk;
import decorator.starbuzz.decorator.Mocha;
import decorator.starbuzz.decorator.Soy;
import decorator.starbuzz.decorator.Whip;
import decorator.starbuzz.model.*;
import decorator.starbuzz.model.Beverage.Size;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.printf("%s $%.2f \n", beverage.getDescription(), beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.printf("%s $%.2f \n", beverage2.getDescription(), beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.printf("%s $%.2f \n", beverage3.getDescription(), beverage3.cost());

        Beverage beverage4 = new Decaf();
        beverage4 = new Milk(beverage4);
        beverage4.setSize(Size.GRANDE);
        beverage4 = new Soy(beverage4);
        System.out.printf("%s $%.2f \n", beverage4.getDescription(), beverage4.cost());
    }
}
