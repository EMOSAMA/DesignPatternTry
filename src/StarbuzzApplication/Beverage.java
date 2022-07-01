package StarbuzzApplication;
enum SIZE {
    tall,grande,venti;
}
public abstract class Beverage {
    String description = "Unknown Beverage";
    SIZE size;
    public String getDescription() {
        return description;
    }
    public  abstract double cost();

    public SIZE getSize () {
        return size;
    }
}
