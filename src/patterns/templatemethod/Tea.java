package patterns.templatemethod;

/**
 * @author FLIGHT
 * @creationDate 18.03.2022
 */
public class Tea extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

}
