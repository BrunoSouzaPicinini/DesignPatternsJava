package singleton;

public class SingletonNonThreadSafe {
    private static SingletonNonThreadSafe uniqueInstance;

    private SingletonNonThreadSafe() {}

    public static SingletonNonThreadSafe getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonNonThreadSafe();
        }
        return uniqueInstance;
    }
}
