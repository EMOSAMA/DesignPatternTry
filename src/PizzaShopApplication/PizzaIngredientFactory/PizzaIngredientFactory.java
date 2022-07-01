package PizzaShopApplication.PizzaIngredientFactory;

import PizzaShopApplication.Ingredient.Cheese.Cheese;
import PizzaShopApplication.Ingredient.Clams.Clams;
import PizzaShopApplication.Ingredient.Dough.Dough;
import PizzaShopApplication.Ingredient.Pepperoni.Pepperoni;
import PizzaShopApplication.Ingredient.Sauce.Sauce;
import PizzaShopApplication.Ingredient.Veggies.Veggies;

import java.util.ArrayList;

public interface PizzaIngredientFactory {
    // 四种原料的实例化方法
    Sauce createSauce();
    Clams createClams();
    Dough createDough();
    Cheese createCheese();
    Pepperoni createPepperoni();
    ArrayList<Veggies> createVeggies();
}
