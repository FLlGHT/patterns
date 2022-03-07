package patterns.factory.pizzastore.ingredients.facrory;

import patterns.factory.pizzastore.ingredients.cheese.Cheese;
import patterns.factory.pizzastore.ingredients.clams.Clams;
import patterns.factory.pizzastore.ingredients.dough.Dough;
import patterns.factory.pizzastore.ingredients.pepperoni.Pepperoni;
import patterns.factory.pizzastore.ingredients.sauce.Sauce;
import patterns.factory.pizzastore.ingredients.veggies.Veggies;

/**
 * @author FLIGHT
 * @creationDate 07.03.2022
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
