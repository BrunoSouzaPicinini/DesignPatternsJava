package singleton;

public class SingletonLazy {
    private static SingletonLazy uniqueInstance;

    private SingletonLazy() {}

    public static synchronized SingletonLazy getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonLazy();
        }
        return uniqueInstance;
    }
}
