/*
    将“需变化”的功能提取出来，构建接口，在这里是飞行行为和叫行为，针对接口编程生成行为子类。
    最后将行为子类与鸭子子类组合使用。达到了解耦的目的，赋予了类更多的变化，并且加强了可维护性。
    这是策略模式。
    这个案例中涉及到了三个设计原则：
        1. 将“变化”与不变化的代码分离
        2. 针对接口变成而不是针对实现编程
        3. 多用组合少用继承。
*/
package DuckApplication;

import DuckApplication.Behavior.Fly.FlyRocketPowered;
import DuckApplication.Duck.*;

public class test {
    public static void main(String[] args) {
        // 初始化鸭子
        MallardDuck mallardDuck = new MallardDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();
        // 测试鸭子
        testDuck(mallardDuck);
        testDuck(redheadDuck);
        testDuck(rubberDuck);
        testDuck(decoyDuck);
        // 给橡皮鸭添加火箭飞行
        rubberDuck.setFlyBehavior(new FlyRocketPowered());
        testDuck(rubberDuck);

    }
    public static void testDuck(Duck duck) {
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
        System.out.println("------------------------------------");
    }
}
