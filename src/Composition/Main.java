package Composition;

/**
 * Created by GAGAN on 09/01/2018.
 */
public class Main {
    public static void main(String args[])
    {
        Dimensions dimensions=new Dimensions(20,20,5);
        Case thecase=new Case("220B","Dell","240",dimensions);
        Monitor monitor=new Monitor("20 inch","Asus",27,new Resolution(2540,2400));
        Motherboard motherboard=new Motherboard("bj-200","acer",
                4,6,"v2.44");
        PC pc=new PC(monitor,thecase,motherboard);
        pc.powerUp();
    }
}
