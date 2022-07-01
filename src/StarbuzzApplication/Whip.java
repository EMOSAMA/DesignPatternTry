package StarbuzzApplication;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public SIZE getSize() {
        return beverage.getSize();
    }

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .35 + this.beverage.cost();
    }

    public void hasWhip () {
        System.out.println("Has Whip");
    }
}