package Composition;

/**
 * Created by GAGAN on 09/01/2018.
 */
public class Table {
    int size;
    String color;

    public Table(int size, String color) {
        this.size = size;
        this.color = color;
    }
    public void study(String name){
        System.out.println( name+" is studying on table");
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
