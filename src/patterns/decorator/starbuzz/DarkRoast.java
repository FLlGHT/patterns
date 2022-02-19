package patterns.decorator.starbuzz;

/**
 * @author FLIGHT
 * @creationDate 19.02.2022
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark roast coffee";
    }

    public double cost() {
        return 0.99;
    }
}
