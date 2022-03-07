package patterns.factory.pizzastore.ingredients.facrory;

import patterns.factory.pizzastore.ingredients.cheese.Cheese;
import patterns.factory.pizzastore.ingredients.cheese.MozzarellaCheese;
import patterns.factory.pizzastore.ingredients.clams.Clams;
import patterns.factory.pizzastore.ingredients.clams.FreshClams;
import patterns.factory.pizzastore.ingredients.dough.Dough;
import patterns.factory.pizzastore.ingredients.dough.ThickCrustDough;
import patterns.factory.pizzastore.ingredients.pepperoni.Pepperoni;
import patterns.factory.pizzastore.ingredients.pepperoni.SlicedPepperoni;
import patterns.factory.pizzastore.ingredients.sauce.PlumTomatoSauce;
import patterns.factory.pizzastore.ingredients.sauce.Sauce;
import patterns.factory.pizzastore.ingredients.veggies.BlackOlives;
import patterns.factory.pizzastore.ingredients.veggies.EggPlant;
import patterns.factory.pizzastore.ingredients.veggies.Spinach;
import patterns.factory.pizzastore.ingredients.veggies.Veggies;

/**
 * @author FLIGHT
 * @creationDate 07.03.2022
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new EggPlant()};
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
