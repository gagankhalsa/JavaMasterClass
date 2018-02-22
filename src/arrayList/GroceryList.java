package arrayList;

import java.util.ArrayList;

public class GroceryList {
    private int[] mynumbers;
    private ArrayList<String> grocerylist=new ArrayList<>();
    public void addgroceryitem(String item)
    {
        grocerylist.add(item);
    }
    public  void printGroceryList(){
        System.out.println("you have "+grocerylist.size()+"items in your list");
      for (int i=0;i<grocerylist.size();i++)
      {
          System.out.println((i+1)+"."+grocerylist.get(i));
      }
    }
    public void modifylist(int pos,String newItem){
     grocerylist.set(pos,newItem);
        System.out.println("Grocery item "+(pos+1)+" has been modified");
    }
    public void removeItem(int pos){
        String removingItem=grocerylist.get(pos);
        grocerylist.remove(pos);
    }
    public String findItem(String searchItem){
        //boolean exists=grocerylist.contains(searchItem);
      int position=grocerylist.indexOf(searchItem);
      if (position>=0)
      {
          return grocerylist.get(position);
      }
      return null;
    }
}

