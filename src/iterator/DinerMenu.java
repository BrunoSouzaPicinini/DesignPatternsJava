package iterator;

import java.math.BigDecimal;
import java.util.Iterator;

public class DinerMenu implements Menu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "Fakin' Bacon with lettuce & tomato on whole wheat", true, new BigDecimal("2.99"));
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, new BigDecimal("2.99"));
        addItem("Soup of the day", "Soup of the day, with saurkraut, relish, onions, topped with cheese", false,
                new BigDecimal("3.29"));
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false,
                new BigDecimal("3.05"));
    }

    public void addItem(String name, String description, Boolean vegetarian, BigDecimal price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
