package com.company;

/**
 * Created by GAGAN on 08/01/2018.
 */
public class VipConstructor_Main {
public static void main(String args[])
{
    VipConstructor customer=new VipConstructor();
    System.out.println(customer.getName());
    VipConstructor cus2=new VipConstructor("bob",50.0);
    System.out.println(cus2.getName());
}
}
