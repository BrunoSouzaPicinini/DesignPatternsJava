package iterator;

import java.math.BigDecimal;
import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{
    Hashtable<String, MenuItem> menuItems = new Hashtable<>();


    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, new BigDecimal("3.99"));   
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, new BigDecimal("3.69"));
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, new BigDecimal("4.29"));
    }

    public void addItem(String name, String description, Boolean vegetarian, BigDecimal price) {
        var menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.name(), menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
