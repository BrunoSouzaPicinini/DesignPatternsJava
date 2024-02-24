package templatemethod;

public class Main {

    public static void main(String[] args) {
        System.out.println("Making coffee...");
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("\nMaking tea...");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}
