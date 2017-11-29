package com.company;

public class Main {

    public static void main(String[] args) {
	int intvalue=10;
	byte bytevalue=120;
	//for byte and short we always do casting
	byte newbyteval=(byte) (bytevalue/2);
	long longvalue=50000+10*(intvalue+bytevalue);
	short shortval=(short)(500+10*(intvalue+bytevalue));
	System.out.println("long value"+longvalue);
		System.out.println("Short value"+shortval);
		//This is java 8 example

		boolean isCar=true;
		boolean wasCar=isCar ? true:false;
		if (wasCar)
		{
			System.out.print("was car is true");
		}
		else
		{
			System.out.print("was car is false");
		}
    }
}
