package Composition;

/**
 * Created by GAGAN on 09/01/2018.
 */
public class Room {
    int size;
    Beds beds;
    Table table;

    public Room(int size, Beds beds, Table table) {
        this.size = size;
        this.beds = beds;
        this.table = table;
    }
      public void cleaning(){
          System.out.println("room is cleaned");
          beds.sleep();
          table.study("Gagan");
      }
    public int getSize() {
        return size;
    }

    public Beds getBeds() {
        return beds;
    }

    public Table getTable() {
        return table;
    }
}
