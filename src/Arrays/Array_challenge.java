package Arrays;

import java.util.Scanner;
import java.util.*;
public class Array_challenge {
     public static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
int[] integers=getInteger(5);
         print(integers);
    }
    public static int[] getInteger(int capacity){
        int[] array=new int[capacity];
        System.out.println("enter"+capacity+"integer values:\r");
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }

        return array;
    }
    public static void print(int[] arr){
//int[] cop=Arrays.copyOf(arr,arr.length);
        int temp=0,i;
        boolean flag=true;
        while(flag) {
            flag=false;
            for (i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag=true;
                }

            }
        }
        for (int i1=0;i1<arr.length;i1++){
        System.out.println("elements "+i1+"contents "+arr[i1]);}
    }
}