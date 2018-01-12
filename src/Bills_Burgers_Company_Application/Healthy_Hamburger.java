package Bills_Burgers_Company_Application;

/**
 * Created by GAGAN on 11/01/2018.
 */

public class Healthy_Hamburger extends Hamburger{
private String healthyItem1;
private double healthyItem1Price;

    private String healthyItem2;
    private double healthyItem2Price;

    public Healthy_Hamburger( String meat, double price) {
        super("Healthy","Brown rye", meat, price);
    }
    public void addHealthyItem1(String name,double price){
       this.healthyItem1=name;
       this.healthyItem1Price=price;

    }
    public void addHealthyItem2(String name,double price){

        this.healthyItem2=name;
        this.healthyItem2Price=price;
    }

    @Override
    public double calculatePrice() {
        double hamburgerPrice= super.calculatePrice();
        if (healthyItem1!=null){
            hamburgerPrice+=healthyItem1Price;
            System.out.println("Added "+this.healthyItem1+" on extra "+this.healthyItem1Price);
        }
        if (healthyItem2!=null){
            hamburgerPrice+=healthyItem2Price;
            System.out.println("Added "+this.healthyItem2+" on extra "+this.healthyItem2Price);
        }
        return hamburgerPrice;
    }
}
