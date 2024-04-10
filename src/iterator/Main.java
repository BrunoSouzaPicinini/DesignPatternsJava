package iterator;

public class Main {
    
    public static void main(String[] args) {
        final var pancakeHouseMenu = new PancakeHouseMenu();
        final var dinerMenu = new DinerMenu();
        final var cafeMenu = new CafeMenu();

        final var waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
