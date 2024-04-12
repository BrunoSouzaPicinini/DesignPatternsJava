package composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent {
    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String desciption) {
        this.name = name;
        this.description = desciption;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
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
    public void print() {
        System.out.print("\n " + getName());
        System.out.println(", " + getDescription());
        System.out.println("------------------");
        menuComponents.forEach(MenuComponent::print);
    }
}
