package com.company;

/**
 * Created by GAGAN on 08/01/2018.
 */
public class AccountMain {
    public static void main(String args[]) {
        BankAccountExample bank=new BankAccountExample();
        //BankAccountExample bank=new BankAccountExample(12345,0.0);
        //bank.setAccountNum(42612673);
   bank.setCusName("GAGANJOT");
    //bank.setBalance(8883.90);
    bank.setEmail("gagan@gmail.com");
   bank.setPhoneNum(514451909);
    System.out.println("Account Number is "+bank.getAccountNum());
    System.out.println("customer Name "+bank.getCusName());
    System.out.println("your balance is "+bank.getBalance());
    System.out.println("Email id is "+bank.getEmail());
    System.out.println("Phone number is "+bank.getPhoneNum());


        bank.withDrawal(100.0);
        bank.depoist(50.0);
        bank.withDrawal(100.0);
    }


}
