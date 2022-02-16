package patterns.strategy.ducks;

/**
 * @author FLIGHT
 * @creationDate 15.02.2022
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm model duck");
    }
}
