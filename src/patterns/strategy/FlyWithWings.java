package patterns.strategy;

/**
 * @author FLIGHT
 * @creationDate 15.02.2022
 */
public class FlyWithWings implements FlyBehavior{

    public void fly() {
        System.out.println("I'm flying!");
    }
}
