package composite;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinnerMenu = new Menu("DINNER MENU", "lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, new BigDecimal("2.99")));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, new BigDecimal("2.99")));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, new BigDecimal("3.49")));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, new BigDecimal("3.59")));

        dinnerMenu.add( new MenuItem("Vegetarian BLT", "Fakin' Bacon with lettuce & tomato on whole wheat", true, new BigDecimal("2.99")));
        dinnerMenu.add( new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, new BigDecimal("2.99")));
        dinnerMenu.add( new MenuItem("Soup of the day", "Soup of the day, with saurkraut, relish, onions, topped with cheese", false, new BigDecimal("3.29")));
        dinnerMenu.add( new MenuItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, new BigDecimal("3.05")));
        dinnerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, new BigDecimal("1.59")));
        dinnerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, new BigDecimal("1.59")));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, new BigDecimal("3.99")));
        cafeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, new BigDecimal("3.69")));
        cafeMenu.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, new BigDecimal("4.29")));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
