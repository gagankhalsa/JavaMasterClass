package Bills_Burgers_Company_Application;

/**
 * Created by GAGAN on 12/01/2018.
 */
public class DeluxBurger extends Hamburger {


    public DeluxBurger() {
        super("Deluxe","White","Bacon",23.89);
       super.addItem1("chips",2.25);
       super.addItem2("drinks",2.25);

    }

    @Override
    public void addItem1(String name, double price) {
        System.out.println("Additional items cannot be added");
    }

    @Override
    public void addItem2(String name, double price) {
        System.out.println("Additional items cannot be added");
    }

    @Override
    public void addItem3(String name, double price) {
        System.out.println("Additional items cannot be added");
    }
}
