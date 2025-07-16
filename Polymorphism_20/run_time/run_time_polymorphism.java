package Polymorphism_20.run_time;

public class run_time_polymorphism {
    // we can give reference of parent class and we can create object of sub class

    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.sayHello();// normal bhoo 
        Dog dog=new Dog();
        dog.sayHello();
        Cat cat=new Cat();
        cat.sayHello();
        // upto this normal output

        // chage is this
        // we can give reference of parent class and we can create object of sub class

        Animal dog1= new Dog();// upcasting
        dog1.sayHello();

        //it goes to the Dog's method due to we create dog's object here 
        
        // this is called method overriding
        // is decides dynamically that methods method is to run - so called dynamically method dispatch

        // downcasting
        Dog myDog=(Dog)dog1;


        //dog1.sayBye(); // we cant access it because the reference is of animal and animal don't contains this method





    }



}
