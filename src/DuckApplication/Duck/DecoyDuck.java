package DuckApplication.Duck;

import DuckApplication.Behavior.Fly.FlyNoWay;
import DuckApplication.Behavior.Quack.MuteQuack;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是诱饵鸭");
    }

    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }
}
