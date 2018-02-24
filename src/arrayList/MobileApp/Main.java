package arrayList.MobileApp;

import java.util.Scanner;

public class Main {
     private static Scanner scanner=new Scanner(System.in);
    private static MobilePhone mobilePhone=new MobilePhone("514 687 3584");
    public static void main(String[] args) {
        boolean quit=false;
        startPhone();
        printAction();
        while(!quit)
        {
            System.out.println("Enter your action:(6 to show available actions)");
         int action=scanner.nextInt();
         scanner.nextLine();
         switch (action){
             case 0:
                 System.out.println("shutting down");
                 quit=true;
                 break;
             case 1:
                 mobilePhone.printContacts();
                 break;
             case 2:
                 addNewContact();
                 break;
             case 3:
                 updateContact();
                 break;
             case 4:
                 removeContacts();
                 break;
             case 5:
                 queryContacts();
                 break;
             case 6:
                 printAction();
                 break;
         }
        }
    }

private static void addNewContact(){
    System.out.println("enter the contact name:");
    String name=scanner.nextLine();
    System.out.println("enter the phone number:");
    String phone =scanner.nextLine();
Contacts newContact=Contacts.createContacts(name,phone);
if (mobilePhone.addNewContact(newContact))
{
    System.out.println("new Contact added:name= "+name+"phone="+phone);
}
else
    System.out.println("cannot add "+name+"already in file");
}

  private static void updateContact(){
      System.out.println("enter existing name:");
      String name=scanner.nextLine();
      Contacts existingContact =mobilePhone.queryContact(name);
      if (existingContact==null)
      {
          System.out.println("Contact not found");
          return;
      }
      System.out.println("enter new name:");
      String newName=scanner.nextLine();
      System.out.println("enter new number:");
      String newNumber=scanner.nextLine();
      Contacts newRecord=Contacts.createContacts(newName,newNumber);
              if(mobilePhone.updateContact(existingContact,newRecord))
              {
                  System.out.println("successfully updated");
              }
  }
    private static void removeContacts() {
        System.out.println("enter existing name:");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(existingContact))
        {
            System.out.println("Contact removed");
        }
        System.out.println("error while removing ..");
    }
    private static void queryContacts() {
        System.out.println("enter existing name:");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("name:"+existingContact.getName()+"phone "+existingContact.getPhoneNumber());
    }
    public static void startPhone(){
        System.out.println("Starting phone.....");
    }
    private static void printAction(){
        System.out.println("\n Available Actions:\n Press");
        System.out.println("0: to shutdown\n"+
                          "1: to print Contacts\n"+
                "2:to add a new contact\n"+
                "3: to update an existing contact\n"+
                "4:to remove an existing contact\n"+
                "5: to query an existing contact\n"+
                "6: to print available actions .");
        System.out.println("Choose your actions");
    }
}
