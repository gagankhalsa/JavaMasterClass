package Polymorphism;

/**
 * Created by GAGAN on 10/01/2018.
 */
class Car{
    boolean engine;
    int cylinders;
    int wheels;
    String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine=true;
        this.wheels=4;
    }

    public String getName() {

        return name;
    }
    public String startEngine(){
        return "engine is started in base class";
    }
    public String accelerate(){
        return "accelerate is working in base class";
    }
    public String brake(){
        return getClass().getSimpleName();//"brakes of  base class car";
    }
}
class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi-->startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi-->accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi-->brake()";
    }
}
class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden-->startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden-->accelerate()";
    }

    @Override
    public String brake() {
        return "Holden-->brake()";
    }
}

    class Ford extends Car{

        public Ford(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Ford-->startEngine()";
        }

        @Override
        public String accelerate() {
            return "Ford-->accelerate()";
        }

        @Override
        public String brake() {
            return "Ford-->brake()";
        }
    }
public class Main2 {
    public static void main(String args[]){
        Car car=new Car(6,"base class");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        
        Holden holdon=new Holden(6,"Holdon class");
        System.out.println(holdon.startEngine());
        System.out.println(holdon.accelerate());
        System.out.println(holdon.brake());

        Ford ford=new Ford(6,"ford class");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}
