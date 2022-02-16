package patterns.strategy.ducks;

/**
 * @author FLIGHT
 * @creationDate 15.02.2022
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm Mallard duck!");
    }

}
