package compoundpatterns;

public class GooseAdapter implements Quackable{
    Observable observable;
    public Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        this.observable = new Observable(this);
    }

    public void quack() {
        goose.honk();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
       this.observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Goose pretending to be a Duck";
    }
}
