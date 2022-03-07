package patterns.factory.pizzastore.store;

import patterns.factory.pizzastore.ingredients.facrory.NYPizzaIngredientFactory;
import patterns.factory.pizzastore.ingredients.facrory.PizzaIngredientFactory;

/**
 * @author FLIGHT
 * @creationDate 21.02.2022
 */
public class NYPizzaStore extends PizzaStore {
    private Pizza pizza;
    private final PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

    public Pizza createPizza(String pizzaName) {
        switch (pizzaName) {
            case "cheese" -> {
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("NY style Cheese Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("NY style Veggie Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("NY style Clam Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("NY style Pepperoni Pizza");
            }
        }
        return pizza;
    }
}
