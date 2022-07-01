package DuckApplication.Duck;

import DuckApplication.Behavior.Fly.FlyNoWay;
import DuckApplication.Behavior.Quack.Squeak;

public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("这是橡皮鸭");
    }

    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }
}
