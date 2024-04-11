package iterator;

import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        final var pancakeHouseMenu = new PancakeHouseMenu();
        final var dinerMenu = new DinerMenu();
        final var cafeMenu = new CafeMenu();

        final var waitress = new Waitress(List.of(pancakeHouseMenu, dinerMenu, cafeMenu));
        waitress.printMenu();
    }
}
