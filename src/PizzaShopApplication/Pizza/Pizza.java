package PizzaShopApplication.Pizza;

import PizzaShopApplication.Ingredient.Cheese.Cheese;
import PizzaShopApplication.Ingredient.Clams.Clams;
import PizzaShopApplication.Ingredient.Dough.Dough;
import PizzaShopApplication.Ingredient.Pepperoni.Pepperoni;
import PizzaShopApplication.Ingredient.Sauce.Sauce;
import PizzaShopApplication.Ingredient.Veggies.Veggies;
import PizzaShopApplication.PizzaIngredientFactory.PizzaIngredientFactory;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clams;
    Pepperoni pepperoni;
    Veggies[] veggies;

    // 不同的pizza有不同的prepare方法，需要用到不同的材料
    public abstract void prepare();

    public void bake() {

    }
    public void cut() {

    }
    public void box() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
