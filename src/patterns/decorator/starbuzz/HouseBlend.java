package patterns.decorator.starbuzz;

/**
 * @author FLIGHT
 * @creationDate 19.02.2022
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }


    public double cost() {
        return 0.89;
    }
}
