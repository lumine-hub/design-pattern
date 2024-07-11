package singleton;

/**
 * 双重锁校验(线程安全)
 */
public class Singleton_05 {
    private static volatile  Singleton_05 instance;

    public static Singleton_05 getInstance() {
        if (instance != null) {
            return instance;
        }
        synchronized (Singleton_05.class) {
            if (instance == null) {
                instance = new Singleton_05();
            }
        }

        return instance;
    }
}
