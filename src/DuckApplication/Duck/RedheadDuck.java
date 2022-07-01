package DuckApplication.Duck;

import DuckApplication.Behavior.Fly.FlyWithWings;
import DuckApplication.Behavior.Quack.Quack;

public class RedheadDuck extends Duck{
    @Override
    public void display() {
        System.out.println("这是红头鸭");
    }

    public RedheadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
}
