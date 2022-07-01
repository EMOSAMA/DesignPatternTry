package PizzaShopApplication.Pizza;

import PizzaShopApplication.PizzaIngredientFactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
    private PizzaIngredientFactory pizzaIngredientFactory;

    // 在创建CheesePizza的时候需要为他指定原料工厂
    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        this.name = "Cheese Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Prepare "+this.name);
        this.dough = pizzaIngredientFactory.createDough();
        this.cheese = pizzaIngredientFactory.createCheese();
        this.sauce = pizzaIngredientFactory.createSauce();
    }

    @Override
    public String toString() {
        return this.dough.getName()+" "+this.cheese.getName()+" "+this.sauce.getName();
    }
}
