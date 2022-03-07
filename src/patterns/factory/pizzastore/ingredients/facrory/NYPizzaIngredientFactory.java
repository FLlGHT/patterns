package patterns.factory.pizzastore.ingredients.facrory;

import patterns.factory.pizzastore.ingredients.cheese.Cheese;
import patterns.factory.pizzastore.ingredients.cheese.ReggianoCheese;
import patterns.factory.pizzastore.ingredients.clams.Clams;
import patterns.factory.pizzastore.ingredients.clams.FreshClams;
import patterns.factory.pizzastore.ingredients.dough.Dough;
import patterns.factory.pizzastore.ingredients.dough.ThinCrustDough;
import patterns.factory.pizzastore.ingredients.pepperoni.Pepperoni;
import patterns.factory.pizzastore.ingredients.pepperoni.SlicedPepperoni;
import patterns.factory.pizzastore.ingredients.sauce.MarinaraSauce;
import patterns.factory.pizzastore.ingredients.sauce.Sauce;
import patterns.factory.pizzastore.ingredients.veggies.*;

/**
 * @author FLIGHT
 * @creationDate 07.03.2022
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
