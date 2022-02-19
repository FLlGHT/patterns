package patterns.decorator.starbuzz;

/**
 * @author FLIGHT
 * @creationDate 19.02.2022
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.description + ", Milk";
    }

    public double cost() {
        return beverage.cost() + 0.10;
    }
}
