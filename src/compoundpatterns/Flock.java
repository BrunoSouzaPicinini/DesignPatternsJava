package compoundpatterns;

import java.util.List;
import java.util.ArrayList;

public class Flock implements Quackable {
    List<Quackable> quackers = new ArrayList<>();
    
    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        var iterator = quackers.iterator();
        while (iterator.hasNext()) {
            var quacker = iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        var iterator = quackers.iterator();
        while (iterator.hasNext()) {
            var quacker = iterator.next();
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {}
}
