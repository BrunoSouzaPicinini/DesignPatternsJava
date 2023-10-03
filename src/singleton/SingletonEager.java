package singleton;

public class SingletonEager {
    private static SingletonEager uniqueInstance = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return uniqueInstance;
    }
}
