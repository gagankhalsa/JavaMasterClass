package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by GAGAN on 05/01/2018.
 */
public class ControlStatemnts {
    public static void main(String args[])
    {
        char switchvalue='E';
        switch (switchvalue){
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("was not a,b,c,d "+" it is "+switchvalue);
                break;
        }
     for (int i=2;i<9;i++)
     {
         System.out.println(i+"% interst "+String.format("%.2f",calcuinterset(10000,i)));
     }
        for (int i=8;i>2;i--)
        {
            System.out.println(i+"% interst "+String.format("%.2f",calcuinterset(10000,i)));
        }
        //for prime numbers
       int count=0;
        for(int i=2;i<=50;i++)
        {
            if (isPrime(i))
            {
                System.out.println(i);
                count++;

            }
            if (count==3)
            {
                break;
            }
        }
        System.out.println("=============number is even or not(using while loop)====================");
       int number=5;
       int fininum=20;
       int count1=0;
       while(number<=fininum){
           if (!isnumEven(number))
           {
               number++;
           }
           System.out.println("even number "+number);
           number++;
           count1++;
           if (count1==5)
           {
               break;
           }

       }
    }
    public static double calcuinterset(double amount,double interest){
        return amount*(interest/100);
    }
    //checking the prime number.
    public static boolean isPrime(int n) {

        if (n == 1)
        {
          return false;
        }
        for(int i=2;i<=n/2;i++){
            if (n%i==0)
            {
                return false;
            }

        }

        return true;

    }
    public static boolean isnumEven(int num){
        if (num%2==0)
        {
           return true;
        }
        return false;
    }

}
