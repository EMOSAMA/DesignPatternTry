package PizzaShopApplication.PizzaFactory;

import PizzaShopApplication.Pizza.Pizza;

public interface PizzaFactory {
    // Pizza的实例化方法
    Pizza createPizza(String type);
}
