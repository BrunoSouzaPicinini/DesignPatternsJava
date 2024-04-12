package composite;

import java.math.BigDecimal;

public interface MenuComponent {

    default void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    default void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    default MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    default String getName() {
        throw new UnsupportedOperationException();
    }

    default String getDescription() {
        throw new UnsupportedOperationException();
    }

    default BigDecimal getPrice() {
        throw new UnsupportedOperationException();
    }
    
    default Boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    default void print() {
        throw new UnsupportedOperationException();
    }
}
