package patterns.singleton;

/**
 * @author FLIGHT
 * @creationDate 08.03.2022
 */
public class SingletonExample {

    private volatile static SingletonExample instance;

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if (instance == null) {
            synchronized (SingletonExample.class) {
                if (instance == null) {
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }
}
