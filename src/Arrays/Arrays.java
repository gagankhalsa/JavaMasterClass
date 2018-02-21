package Arrays;

import java.util.Scanner;

/**
 * Created by GAGAN on 15/01/2018.
 */
public class Arrays {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String args[]) {
        int[] values=getIntegers(5);
        for (int i=0;i<values.length;i++)
        {
           System.out.println("element "+i+"typed value was "+values[i]);
        }
        System.out.println("Average of an Array "+getAverage(values));
        //Practice of Arrays*/
        System.out.println(".............practice of arrays.................");
        double [] codes=new double[10];
        System.out.println(codes.length);
        int[] a1={1,2,3,4};
        int[] a2={10,20,30};
        System.out.println("length of Array before "+a1.length);
        System.out.println(" Element of Array at this 1st position"+a1[1]);
        a1=a2;
        System.out.println("length of Array after "+a1.length);
        System.out.println("\" Element of Array at this 1st position\""+a1[1]);
        int []temp=incrementArray(a1);
        for(int i=0;i<temp.length;i++)
        {
            System.out.println("values of temp "+temp[i]);
        }
        //temp=a;
        System.out.println("length of array a.length is "+temp.length);

        }
    public static int [] incrementArray(int[] a){

        int[] temp=new int[a.length];
        for (int i=0;i<a.length;i++) {
            temp[i] = a[i];
            System.out.println("increment array " + (temp[i]+2));
        }
        return temp;



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