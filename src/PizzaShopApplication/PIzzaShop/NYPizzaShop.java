package PizzaShopApplication.PIzzaShop;

import PizzaShopApplication.PizzaFactory.NYPizzaFactory;

public class NYPizzaShop extends PizzaShop {

    // 需要指定工厂
    public NYPizzaShop() {
        this.pizzaFactory = new NYPizzaFactory();
    }
}
