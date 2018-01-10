package Polymorphism;

/**
 * Created by GAGAN on 10/01/2018.
 */
class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}
class jaws extends Movie{

    public jaws() {
        super("jaws");
    }
    public String plot(){
        return "a shark eats lots of people";
    }
}
class IndependenceDay extends Movie{

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "aliens attempt to take over planet earth";
    }
}
class MazeRunner extends Movie{

    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "kids try and escape a maze";
    }
}
class StarWars extends Movie{
    public StarWars() {
        super("star wars");
    }

    @Override
    public String plot() {
        return "imperial forces try to take over the universal";
    }
}
class Forgettable extends Movie{

    public Forgettable() {
        super("Forgettable");
    }
    //no plot method
}

public class Main {
    public static void main (String args[]){
        for (int i=1;i<=5;i++)
        {
            Movie movie=randomMovie();
            System.out.println("Movie #"+i+":"+movie.getName()+"\n"+
                                 "plot: "+movie.plot()+"\n");
        }
    }
    public static Movie randomMovie(){
        int randomNumber=(int)(Math.random()*5)+1;
        System.out.println("Random Number generated "+randomNumber);
        switch (randomNumber){
            case 1:
                return new jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                    return new StarWars();
            case 5:
                return new Forgettable();
        }
        return null;
    }
}
