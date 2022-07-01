package PizzaShopApplication.PizzaFactory;

import PizzaShopApplication.Pizza.CheesePizza;
import PizzaShopApplication.Pizza.Pizza;
import PizzaShopApplication.PizzaIngredientFactory.NYPizzaIngredientFactory;

public class NYPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza(String type) {
        NYPizzaIngredientFactory nyPizzaIngredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza = null;
        if (type.equals("cheese pizza")) {
            System.out.println("Create Cheese Pizza");
            pizza = new CheesePizza(nyPizzaIngredientFactory);
        }
        return pizza;
    }
}
