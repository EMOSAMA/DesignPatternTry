package StarbuzzApplication;

public class Espresso extends Beverage {
    public Espresso(SIZE size) {
        this.description = "Espresso";
        this.setSize(size);
    }
    public double cost() {
        return 1.99;
    }
    public void setSize(SIZE size) {
        this.size = size;
    }
}