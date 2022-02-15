package patterns.strategy;

/**
 * @author FLIGHT
 * @creationDate 15.02.2022
 */
public class Squeak implements QuackBehavior{

    public void quack() {
        System.out.println("Squeak!");
    }
}
