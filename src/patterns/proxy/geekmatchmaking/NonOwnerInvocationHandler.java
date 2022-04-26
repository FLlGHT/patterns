package patterns.proxy.geekmatchmaking;

import java.lang.reflect.*;

/**
 * @author FLIGHT
 * @creationDate 26.04.2022
 */
public class NonOwnerInvocationHandler implements InvocationHandler {

    private final Person person;

    public NonOwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get"))
                return method.invoke(person, args);
            else if (method.getName().equals("setGeekRating"))
                return method.invoke(person, args);
            else if (method.getName().startsWith("set"))
                throw new IllegalAccessException();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
