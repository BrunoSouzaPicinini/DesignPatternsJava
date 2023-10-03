package singleton;

import java.util.concurrent.atomic.AtomicReference;

public class SingletonLazyDoubleCheckWithAtomic {
    private static AtomicReference<SingletonLazyDoubleCheckWithAtomic> uniqueAtomicInstance = new AtomicReference<>();

    private SingletonLazyDoubleCheckWithAtomic() {}

    public static SingletonLazyDoubleCheckWithAtomic getInstance() {
        uniqueAtomicInstance.compareAndSet(null, new SingletonLazyDoubleCheckWithAtomic());
        return uniqueAtomicInstance.get();
    }
}
