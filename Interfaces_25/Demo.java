package Interfaces_25;



public class Demo {
    // class is a blueprint for objects 
    // interface is a blueprint for class
    // multiple inheritance in java is achieved by interfaces
    // interface contains abstract methods and static constants  
    // interfaces has two uses to achieve multiple inheritance and abstraction
    // interfaces-static-abstract(imp abs methods) (nearly same - means at time of exeception beacsue interface make a use of static)
    // we can't create object of the interface

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        
        Cat cat=new Cat();
        cat.sleep(); 

      System.out.println(Dog.max_age);
      System.out.println(Animal.max_age);
            // we wrote implements so all constants of animal are usable in dog-cat

      Animal.info();
      //Dog.info();// Static methods are only acccessible thriugh interfaces

        dog.run();
        cat.run();


        // difference between abstract class and interfaces

        // abstract class contains instance variables and constructor is used to initialised it 
        // in interfaces this is not a case
        // in class extracts only one abstract  class
        // one class ectracts multiple interfaces 


    }




}
