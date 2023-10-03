package singleton;
public class SingletonLazyDoubleCheck {
    private static volatile SingletonLazyDoubleCheck uniqueInstance;

    private SingletonLazyDoubleCheck() {}

    public static SingletonLazyDoubleCheck getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonLazyDoubleCheck.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonLazyDoubleCheck();
                }
            }
        }
        return uniqueInstance;
    }
}
