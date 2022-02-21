package patterns.factory.pizzastore;

/**
 * @author FLIGHT
 * @creationDate 21.02.2022
 */
public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }
        if (item.equals("clam")) {
            return new NYStyleClamPizza();
        }
        if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }
        else return null;
    }
}
