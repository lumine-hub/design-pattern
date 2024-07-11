package singleton;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/**
 * CAS「AtomicReference」(线程安全)
 */
public class Singleton_06 {
    private static final AtomicReference<Singleton_06> INSTANCE = new AtomicReference<>();

    public static Singleton_06 getInstance() {
//       return INSTANCE.updateAndGet(instance -> instance != null ? instance : new Singleton_06());
        // 下面代码的原理和上面差不多
        for (;;) {
            Singleton_06 pre = INSTANCE.get();
            if (pre != null) return pre;
            INSTANCE.compareAndSet(null, new Singleton_06());
            return INSTANCE.get();
        }
    }
    public static void main(String[] args) {
        System.out.println(Singleton_06.getInstance()); // org.itstack.demo.design.Singleton_06@2b193f2d
        System.out.println(Singleton_06.getInstance()); // org.itstack.demo.design.Singleton_06@2b193f2d
    }
}
