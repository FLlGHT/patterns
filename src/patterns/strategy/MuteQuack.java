package patterns.strategy;

/**
 * @author FLIGHT
 * @creationDate 15.02.2022
 */
public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< Silence >> ");
    }
}
