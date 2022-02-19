package patterns.decorator.starbuzz;

/**
 * @author FLIGHT
 * @creationDate 19.02.2022
 */
public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
