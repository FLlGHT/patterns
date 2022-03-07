package patterns.factory.pizzastore.store;

import patterns.factory.pizzastore.ingredients.cheese.Cheese;
import patterns.factory.pizzastore.ingredients.clams.Clams;
import patterns.factory.pizzastore.ingredients.dough.Dough;
import patterns.factory.pizzastore.ingredients.pepperoni.Pepperoni;
import patterns.factory.pizzastore.ingredients.sauce.Sauce;
import patterns.factory.pizzastore.ingredients.veggies.Veggies;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FLIGHT
 * @creationDate 21.02.2022
 */
public abstract class Pizza {

    private String name;
    private Dough dough;
    private Sauce sauce;
    private Veggies[] veggies;
    private Cheese cheese;
    private Pepperoni pepperoni;
    private Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Veggies[] getVeggies() {
        return veggies;
    }

    public void setVeggies(Veggies[] veggies) {
        this.veggies = veggies;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Clams getClam() {
        return clam;
    }

    public void setClam(Clams clam) {
        this.clam = clam;
    }
}
