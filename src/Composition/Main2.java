package Composition;

/**
 * Created by GAGAN on 09/01/2018.
 */
public class Main2 {
    public static void main(String args[]){
        Table table=new Table(20,"white");
        Beds beds=new Beds(12,"black");
        Room room=new Room(50,beds,table);
 House house=new House(502,"h3h1v9",room);
house.enter();


    }
}
