package singleton;

/**
 * 使用类的内部类(线程安全)
 */
public class Singleton_04 {

    public static class SingletonHolder {
        private static Singleton_04 singleton04 = new Singleton_04();

    }
    Singleton_04 getInstance() {
        return SingletonHolder.singleton04;
    }
}
