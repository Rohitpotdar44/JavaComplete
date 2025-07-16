package Abstraction_21.abstraction;

public class Dog extends Animal {
    // here we have two options either two write abstract in class or to write abstract method
    @Override
    public void sayHello() {
        System.out.println("wooooof");
    }
    // here abstraction concept is we just declare method in Animal.java and other classes can writes it's own definition e.g here Dog.java
    
    

}
