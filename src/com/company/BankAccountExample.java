package com.company;

/**
 * Created by GAGAN on 08/01/2018.
 */
public class BankAccountExample {

   private  int accountNum;
    private double balance;
   private String cusName;
   private String Email;
  private  int phoneNum;
  //constructor
    public BankAccountExample(){
        this(1567,890);//this line will always be executed first
        System.out.println("Empty constructor called");
    }
    public BankAccountExample(int accountNum,double balance){
        this.accountNum=accountNum;
        this.balance=balance;
        System.out.println("parameterized constuctor is called");
    }


    public void setAccountNum(int accountNum){
        this.accountNum=accountNum;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setCusName(String cusName){
        this.cusName=cusName;
    }
    public void setEmail(String email){
        this.Email=email;
    }
    public void setPhoneNum(int phoneNum){
        this.phoneNum=phoneNum;
    }
    public int getAccountNum(){
        return this.accountNum;
    }
    public String getCusName(){
        return this.cusName;
    }
    public double getBalance(){
        return this.balance;
    }

    public String getEmail(){
        return this.Email;
    }
    public int getPhoneNum(){
        return this.phoneNum;
    }
    public void depoist(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("Balance after deposit of "+depositAmount+" amount "+this.balance);
    }
    public void withDrawal(double withdrawalAmount){
        if (this.balance-withdrawalAmount<=0) {
            System.out.println("only " + this.balance + " is available. Withdrawal not processed");
        }else{
            this.balance-=withdrawalAmount;
            System.out.println("withdrawal of"+withdrawalAmount+" processed "+" balance is "+this.balance);
        }
    }

}
