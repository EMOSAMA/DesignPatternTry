package StarbuzzApplication;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public SIZE getSize() {
        return beverage.getSize();
    }

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + .20;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public void hasMocha () {
        System.out.println("Has Mocha");
    }
}
