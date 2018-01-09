package Composition;

/**
 * Created by GAGAN on 09/01/2018.
 */
public class Beds {
    int size;
    String color;

    public Beds(int size, String color) {
        this.size = size;
        this.color = color;
    }
    public void sleep(){
        System.out.println("someone is sleeping on bed");
    }


    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
