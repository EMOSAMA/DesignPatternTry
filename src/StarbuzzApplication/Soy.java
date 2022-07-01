package StarbuzzApplication;

public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public SIZE getSize() {
        return beverage.getSize();
    }
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }
    public double cost() {
        if (this.getSize() == SIZE.tall) {
            return .50 + this.beverage.cost();
        }else if (this.getSize() == SIZE.grande) {
            return .25 + this.beverage.cost();
        } else {
            return .10 + this.beverage.cost();
        }
    }
    public void hasSoy () {
        System.out.println("Has Soy");
    }
}
