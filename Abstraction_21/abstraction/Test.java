package Abstraction_21.abstraction;

public class Test {
    public static void main(String[] args) {
        
        Dog dog=new Dog();
        dog.sayHello();
        // also we can do this
        Animal dog1=new Dog();// we can give reference of animal
        dog1.setAge(4);
        // but we can't create object of Abtract class-> beacuse then there is no definition of abstract method
        
        
        
        // protected -> access with in a same pacakage and can be override in other place-> used to access that field or method which excends the parent(main)class
    }
}
