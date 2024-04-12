package composite;

import java.math.BigDecimal;

public class MenuItem implements MenuComponent{
    private String name;
    private String description;
    private boolean isVegetarian;
    private BigDecimal price;

    public MenuItem(String name, String description, boolean isVegetarian, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public Boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("       --" + getDescription());
    }
}
