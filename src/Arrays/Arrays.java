package Arrays;

import java.util.Scanner;

/**
 * Created by GAGAN on 15/01/2018.
 */
public class Arrays {
    static Scanner scanner=new Scanner(System.in);
    //static int[] myIntArray = new int[10];
    public static void main(String args[]) {
        int[] values=getIntegers(5);
        for (int i=0;i<values.length;i++)
        {
            System.out.println("element "+i+"typed value was "+values[i]);
        }
        System.out.println("Average of an Array "+getAverage(values));
      /*  //{1,2,3,4,5};
        for (int i = 0; i <10; i++) {
           myIntArray[i]=i*10;
        }
       *//* for (int i=0;i<10;i++)
        {
            System.out.println("Element "+i+"value is "+myIntArray[i]);
        }
        System.out.println(myIntArray[2]);*//*
        printArray(myIntArray);


    }
    public static void printArray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        array[2]=89;*/

    }
    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" integer values");
        int[] values=new int[number];
        for (int i=0;i<values.length;i++)
        {
            values[i]=scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array){
        int sum=0;
        for (int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        return (double)sum/(double) array.length;
    }
}