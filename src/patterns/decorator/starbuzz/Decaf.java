package patterns.decorator.starbuzz;

/**
 * @author FLIGHT
 * @creationDate 19.02.2022
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf coffee";
    }

    public double cost() {
        return 1.05;
    }
}
