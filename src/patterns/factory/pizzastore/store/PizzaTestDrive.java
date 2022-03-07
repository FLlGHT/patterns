package patterns.factory.pizzastore.store;

/**
 * @author FLIGHT
 * @creationDate 21.02.2022
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Michael ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Danny ordered a " + pizza.getName() + "\n");
    }
}
