package Bills_Burgers_Company_Application;

/**
 * Created by GAGAN on 11/01/2018.
 */
public class Main {
    public static void main(String args[]){
Hamburger hamburger=new Hamburger("Basic","white","meat",3.25);

       hamburger.calculatePrice();
       hamburger.addItem1("carrots",0.75);
       hamburger.addItem2("lettuce",1.24);
       System.out.println("Total price "+
                hamburger.calculatePrice());

        System.out.println("==============================================");
        Healthy_Hamburger healthyHamburger=new Healthy_Hamburger("Bacon",5.46);
        //healthyHamburger.calculatePrice();
        healthyHamburger.addItem1("Egg",2.50);
        healthyHamburger.addHealthyItem1("lentils",3.50);
        System.out.println("Total price for healthy burger is "+ healthyHamburger.calculatePrice());
        System.out.println("==============================================");
        DeluxBurger deluxBurger=new DeluxBurger();
        deluxBurger.calculatePrice();
        System.out.println("Total price for deluxe burger " +deluxBurger.calculatePrice());
        deluxBurger.addItem1("carrots",3.00);
    }
}
