package singleton;

import java.util.concurrent.atomic.AtomicReference;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;
    private static AtomicReference<ChocolateBoiler> uniqueInstance = new AtomicReference<>();

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance() {
        if (uniqueInstance.get() == null) {
            uniqueInstance.set(new ChocolateBoiler());
        }
        return uniqueInstance.get();
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
