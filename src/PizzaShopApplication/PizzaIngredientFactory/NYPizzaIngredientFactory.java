package PizzaShopApplication.PizzaIngredientFactory;

import PizzaShopApplication.Ingredient.Cheese.Cheese;
import PizzaShopApplication.Ingredient.Cheese.CheeseA;
import PizzaShopApplication.Ingredient.Clams.Clams;
import PizzaShopApplication.Ingredient.Clams.ClamsA;
import PizzaShopApplication.Ingredient.Dough.Dough;
import PizzaShopApplication.Ingredient.Dough.DoughA;
import PizzaShopApplication.Ingredient.Pepperoni.Pepperoni;
import PizzaShopApplication.Ingredient.Pepperoni.PepperoniA;
import PizzaShopApplication.Ingredient.Sauce.Sauce;
import PizzaShopApplication.Ingredient.Sauce.SouceA;
import PizzaShopApplication.Ingredient.Veggies.Veggies;
import PizzaShopApplication.Ingredient.Veggies.VeggiesA;

import java.util.ArrayList;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Pepperoni createPepperoni() {
        return new PepperoniA();
    }

    @Override
    public ArrayList<Veggies> createVeggies() {
        ArrayList<Veggies> veggies =new ArrayList<>();
        veggies.add(new VeggiesA());
        return veggies;
    }

    @Override
    public Cheese createCheese() {
        return new CheeseA();
    }

    @Override
    public Clams createClams() {
        return new ClamsA();
    }

    @Override
    public Dough createDough() {
        return new DoughA();
    }

    @Override
    public Sauce createSauce() {
        return new SouceA();
    }
}
