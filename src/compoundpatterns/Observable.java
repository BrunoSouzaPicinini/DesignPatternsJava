package compoundpatterns;

import java.util.ArrayList;
import java.util.List;

public class Observable implements QuackObservable{
    List<Observer> observers = new ArrayList<Observer>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        var iterator = observers.iterator();
        while (iterator.hasNext()) {
            var observer = iterator.next();
            observer.update(duck);
        }
    }


}
