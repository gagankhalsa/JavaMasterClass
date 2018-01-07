package com.company;

public class Main {

    public static void main(String[] args) {

		int intvalue = 10;
		byte bytevalue = 120;
		//for byte and short we always do casting
		byte newbyteval = (byte) (bytevalue / 2);
		long longvalue = 50000 + 10 * (intvalue + bytevalue);
		short shortval = (short) (500 + 10 * (intvalue + bytevalue));
		System.out.println("long value" + longvalue);
		System.out.println("Short value" + shortval);
		//This is java 8 example
		precedence(20,80);

		boolean isCar = true;
		boolean wasCar = isCar ? true : false;
		if (wasCar) {
			System.out.print("was car is true");
		} else {
			System.out.println("was car is false");
		}
	}
     public static double precedence(double a,double b){

		double c=(a+b)*25;
		System.out.println(c);
		double d=c%40;
		if (d<=20)
		{
			System.out.println("Total was over the limit"+d);
		}
		return d;
		}

    }

