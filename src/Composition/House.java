package Composition;

/**
 * Created by GAGAN on 09/01/2018.
 */
public class House {
    int houseNo;
    String address;
    Room room;

    public House(int houseNo, String address, Room room) {
        this.houseNo = houseNo;
        this.address = address;
        this.room = room;
    }
    public void enter(){
        room.cleaning();
    }
    public void enterRoom(){
        System.out.println("someone entered int the room");
        room.cleaning();
    }
}
