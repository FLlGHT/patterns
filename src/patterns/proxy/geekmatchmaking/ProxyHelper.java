package patterns.proxy.geekmatchmaking;

import java.lang.reflect.Proxy;

/**
 * @author FLIGHT
 * @creationDate 26.04.2022
 */
public class ProxyHelper {

    public Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
    }

    public Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
    }

    public Person getProxy(boolean owner, Person person) {
        if (owner) return getOwnerProxy(person);
        return getNonOwnerProxy(person);
    }
}
