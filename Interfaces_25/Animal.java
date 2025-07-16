package Interfaces_25;

public interface Animal 
{
    //1. abstract methods

    public abstract void eat();
    // no need to write even public abstract - it is interface property 
    void sleep();
    // we can't create object of the interface , because it is like the abstract class , so it does not contain any type of definition , so there is no sence of creating objects
    // also we can't create constructor
    // here we uses implememts keyword(like extends in inhehitance)


    // 2. Static Constants

    public static final int max_age=20;
    // not necessary to even write public ststic final they are already static constants 
    int max_speed=50;

    // Interfaces have static and default methods

    // 1. Static Methods

    public static void info(){
        System.out.println("This is an animal interface");
    }

    // adv- there may be multiple interfaces so by using static methods we can able to know extra info about it
    // size of code is also reduced


    //2.Default Methods

    // adv- suppose there is an interface and 100 implepenting classes and suppose we have to run one static method - then we have to implement it on that 100 classes
    // so just by adding default method it will be done in easier way -> because it uses instances to call not interfaces
    // also we can make a use of this. here  
    // so disturbance is not creating

    public default void run(){
        System.out.println("Animal is runnning.....");
        this.eat();
    }






}
