package patterns.decorator.starbuzz;

/**
 * @author FLIGHT
 * @creationDate 19.02.2022
 */
public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract String getDescription();
}
