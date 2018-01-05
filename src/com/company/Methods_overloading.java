package com.company;

/**
 * Created by GAGAN on 30/12/2017.
 */

public class Methods_overloading {
    public static void main(String args[]) {
        double newscore = calcuFeetAndInches(98);
        System.out.print("new score is" + newscore);
    }

    /*public static int calculateScore(String playername, int score) {
        System.out.println("player" + playername + "scored" + score);
        return score * 1000;
    }*/

    //challenge
    public static double calcuFeetAndInches(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            double feettoInch = feet * 12;
            feettoInch = (feettoInch * 2.54) + (inches * 2.54);
            return feettoInch;
        }
        return -1;

    }

    public static double calcuFeetAndInches(double inch) {
     if(inch>=0)
     {
       int inch1=(int)inch/12;
       int remainder=(int)inch%12;
       System.out.println(inch +" feets" + inch1+ " and inches "+remainder);
       return inch;
     }
        return -1;
    }

}
