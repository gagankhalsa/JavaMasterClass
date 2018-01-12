package Bills_Burgers_Company_Application;

/**
 * Created by GAGAN on 11/01/2018.
 */
public class Hamburger {
     String name;
    String rollType;
    String meat;
    double price = 50;

    private String item1;
    private double item1price;

    private String item2;
    private double item2price;

    private String item3;
    private double item3price;


    public Hamburger( String name,String rollType, String meat, double price) {
        this.name=name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;

    }
    public void addItem1(String name,double price)
    {
        this.item1=name;
        this.item1price=price;
    }
    public void addItem2(String name,double price)
    {
        this.item2=name;
        this.item2price=price;
    }
    public void addItem3(String name,double price)
    {
        this.item3=name;
        this.item3price=price;
    }

    public double calculatePrice() {
        double hamburgerPrice=this.price;
        System.out.println(this.name+" hamburger "+" on a "+this.rollType+" roll "+this.meat+" price "+this.price);
        if (item1!=null)
        {
            hamburgerPrice+=item1price;
            System.out.println(" Added "+this.item1+" for an extra "+this.item1price);
        }
        if (item2!=null)
        {
            hamburgerPrice+=item2price;
            System.out.println(" Added "+this.item2+" for an extra "+this.item2price);
        }
        if (item3!=null)
        {
            hamburgerPrice+=item3price;
            System.out.println(" Added "+this.item3+" for an extra "+this.item3price);
        }
        return hamburgerPrice;
    }

}