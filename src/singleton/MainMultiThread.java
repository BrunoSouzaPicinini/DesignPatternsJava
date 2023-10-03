package singleton;

import java.util.ArrayList;

public class MainMultiThread {

    public static void main(String[] args) {

        var setOfSingletonsNonThreadSafe = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            var thread = new Thread(() -> {
                var singleton = SingletonNonThreadSafe.getInstance();
                setOfSingletonsNonThreadSafe.add(singleton);
            });
            thread.start();
        }
        System.out.println("Set of singletons: " + setOfSingletonsNonThreadSafe.stream().distinct().toList().size());
        setOfSingletonsNonThreadSafe.stream().distinct().forEach(System.out::println);

        var setOfSingletons = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            var thread = new Thread(() -> {
                var singleton = SingletonLazy.getInstance();
                setOfSingletons.add(singleton);
            });
            thread.start();
        }
        System.out.println("Set of singletons: " + setOfSingletons.stream().distinct().toList().size());
        setOfSingletons.stream().distinct().forEach(System.out::println);

        var setOfSingletonsLazyDoubleCheck= new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            var thread = new Thread(() -> {
                var singleton = SingletonLazyDoubleCheck.getInstance();
                setOfSingletonsLazyDoubleCheck.add(singleton);
            });
            thread.start();
        }
        System.out.println("Set of singletons: " + setOfSingletonsLazyDoubleCheck.stream().distinct().toList().size());
        setOfSingletonsLazyDoubleCheck.stream().distinct().forEach(System.out::println);

        var setOfSingletonsLazyDoubleCheckWithAtomic= new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            var thread = new Thread(() -> {
                var singleton = SingletonLazyDoubleCheckWithAtomic.getInstance();
                setOfSingletonsLazyDoubleCheckWithAtomic.add(singleton);
            });
            thread.start();
        }
        System.out.println("Set of singletons: " + setOfSingletonsLazyDoubleCheckWithAtomic.stream().distinct().toList().size());
        setOfSingletonsLazyDoubleCheckWithAtomic.stream().distinct().forEach(System.out::println);
    }
}
