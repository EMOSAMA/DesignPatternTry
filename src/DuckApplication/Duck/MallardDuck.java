package DuckApplication.Duck;

import DuckApplication.Behavior.Fly.FlyWithWings;
import DuckApplication.Behavior.Quack.Quack;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是绿头鸭");
    }

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
}
