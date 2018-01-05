package com.company;

/**
 * Created by GAGAN on 30/11/2017.
 */
public class Methods_example {
    public static void main(String args[]){
        //displayHighScorePos("ajay",12);
        //Methods_example obj=new Methods_example();
        int scoreValue=calculateHighScore(1500);
                displayHighScorePos("ajay",scoreValue);
        scoreValue=calculateHighScore(900);
        displayHighScorePos("bob",scoreValue);
        scoreValue=calculateHighScore(400);
        displayHighScorePos("tom",scoreValue);
         scoreValue=calculateHighScore(50);
        displayHighScorePos("jot",scoreValue);
        System.out.println();
        //obj.calculateHighScore(1);
    }




    public  static void displayHighScorePos(String name,int highscoreposition){
       System.out.println(name+ "managed to get posiotin" +" "+highscoreposition);
    }
    public static int calculateHighScore(int score){
        if (score>1000)
        {
            //System.out.printl("1");
        return 1;
        }
        else if (score>500&&score<1000)
        {return 2;
            //System.out.println("2");
        }
        else if (score>100 && score<500)
        {return 3;
            //System.out.println("3");
        }


           else
        {
            return 4;
        }

//return -1;


    }

}
