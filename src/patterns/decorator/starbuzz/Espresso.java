package patterns.decorator.starbuzz;

/**
 * @author FLIGHT
 * @creationDate 19.02.2022
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
