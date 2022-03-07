package patterns.factory.pizzastore.store;

import patterns.factory.pizzastore.ingredients.facrory.ChicagoPizzaIngredientFactory;
import patterns.factory.pizzastore.ingredients.facrory.NYPizzaIngredientFactory;
import patterns.factory.pizzastore.ingredients.facrory.PizzaIngredientFactory;

/**
 * @author FLIGHT
 * @creationDate 21.02.2022
 */
public class ChicagoPizzaStore extends PizzaStore {

    private Pizza pizza;
    private final PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

    public Pizza createPizza(String pizzaName) {
        switch (pizzaName) {
            case "cheese" -> {
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("Chicago style Cheese Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("Chicago style Veggie Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("Chicago style Clam Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("Chicago style Pepperoni Pizza");
            }
        }
        return pizza;
    }
}
