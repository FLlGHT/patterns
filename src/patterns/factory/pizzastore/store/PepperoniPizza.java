package patterns.factory.pizzastore.store;

import patterns.factory.pizzastore.ingredients.facrory.PizzaIngredientFactory;

/**
 * @author FLIGHT
 * @creationDate 07.03.2022
 */
public class PepperoniPizza extends Pizza {

    private final PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(pizzaIngredientFactory.createDough());
        setSauce(pizzaIngredientFactory.createSauce());
        setCheese(pizzaIngredientFactory.createCheese());
        setClam(pizzaIngredientFactory.createClam());
    }
}
