package patterns.strategy.ducks;

/**
 * @author FLIGHT
 * @creationDate 15.02.2022
 */
public class FlyRocketPowered implements FlyBehavior {

    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
