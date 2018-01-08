package com.company;

/**
 * Created by GAGAN on 08/01/2018.
 */
public class VipConstructor {
    String name;
    double creditLimit;
    String email;
    public VipConstructor()
    {
        this("default name",100.0,"dfault@");
        //System.out.println("empty constructor");
    }
    public VipConstructor(String name,double creditLimit)
    {
        this(name,creditLimit,"defaultvalue");
        this.name=name;
        this.creditLimit=creditLimit;
        //System.out.println(" 2nd constructor");
    }
    public VipConstructor(String name,double creditLimit,String email)
    {
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
        //System.out.println("3rd constructor");
    }
    public String getName(){
        return this.name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
