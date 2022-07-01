package PizzaShopApplication.PIzzaShop;

import PizzaShopApplication.Pizza.Pizza;
import PizzaShopApplication.PizzaFactory.PizzaFactory;

public abstract class PizzaShop {
    // 需要拥有一个PizzaFactory用于实例化Pizza
    PizzaFactory pizzaFactory;

    public Pizza orderPizza(String type) {
        // 对象的实例化交给工厂
        Pizza pizza = pizzaFactory.createPizza(type);

        // 不变的部分
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
