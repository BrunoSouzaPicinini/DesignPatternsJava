package singleton;

public class Main {

    public static void main(String[] args) {
        var singletonLazy = SingletonLazy.getInstance();
        var singletonEager = SingletonEager.getInstance();
        var singletonLazyDoubleCheck = SingletonLazyDoubleCheck.getInstance();
        var singletonLazyDoubleCheckWithAtomic = SingletonLazyDoubleCheckWithAtomic.getInstance();

        System.out.println("SingletonLazy: " + singletonLazy);
        System.out.println("SingletonEager: " + singletonEager);
        System.out.println("SingletonLazyDoubleCheck: " + singletonLazyDoubleCheck);
        System.out.println("SingletonLazyDoubleCheckWithAtomic: " + singletonLazyDoubleCheckWithAtomic);

        var chocolateBoiler = ChocolateBoiler.getInstance();
        var chocolateBoiler2 = ChocolateBoiler.getInstance();

        System.out.println("ChocolateBoiler: " + chocolateBoiler);
        System.out.println("ChocolateBoiler2: " + chocolateBoiler2);

    }
}
