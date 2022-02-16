package patterns.strategy.ducks;

/**
 * @author FLIGHT
 * @creationDate 15.02.2022
 */
public class Quack implements QuackBehavior{

    public void quack() {
        System.out.println("Quack");
    }
}
