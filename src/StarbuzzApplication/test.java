package StarbuzzApplication;

public class test {
    public static void main(String[] args) {
        Beverage coffee1 = new Espresso(SIZE.tall);
        System.out.println(coffee1.getDescription() + " | " + coffee1.cost());

        Beverage coffee2 = new Espresso(SIZE.grande);
        coffee2 = new Mocha(coffee2);
        System.out.println(coffee2.getDescription() + " | " + coffee2.cost());
        if (coffee2 instanceof Whip) {
            ((Whip)coffee2).hasWhip();
        }

        Beverage coffee3 = new Espresso(SIZE.venti);
        coffee3 = new Soy(coffee3);
        coffee3 = new Whip(coffee3);
        System.out.println(coffee3.getDescription() + " | " + coffee3.cost());

        if (coffee3 instanceof Whip) {
            ((Whip)coffee3).hasWhip();
        }
        if (((Whip) coffee3).beverage instanceof Soy) {
            ((Soy)((Whip) coffee3).beverage).hasSoy();
        }
    }
}
