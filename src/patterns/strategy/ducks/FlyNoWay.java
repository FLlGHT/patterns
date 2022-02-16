package patterns.strategy.ducks;

/**
 * @author FLIGHT
 * @creationDate 15.02.2022
 */
public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("I can't fly!");
    }
}
