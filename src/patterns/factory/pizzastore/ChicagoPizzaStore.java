package patterns.factory.pizzastore;

/**
 * @author FLIGHT
 * @creationDate 21.02.2022
 */
public class ChicagoPizzaStore extends PizzaStore{

    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }
        if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        }
        if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }
        else return null;
    }
}
