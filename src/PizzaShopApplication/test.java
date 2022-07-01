package PizzaShopApplication;

import PizzaShopApplication.PIzzaShop.NYPizzaShop;
import PizzaShopApplication.PIzzaShop.PizzaShop;
import PizzaShopApplication.Pizza.Pizza;

public class test {
    public static void main(String[] args) {
        PizzaShop pizzaShop1 = new NYPizzaShop();
        Pizza pizza = pizzaShop1.orderPizza("cheese pizza");
        System.out.println(pizza);
    }
}
