package Inheritance_19.test_hierarchical_inheritance;

import Inheritance_19.Human_multilevel_inheritance.Child;
import Inheritance_19.Human_multilevel_inheritance.Parent;
import Inheritance_19.method_overriding.Cat;
import Inheritance_19.method_overriding.Dog;
// import 
public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog();// access form another package so it imports automatically -> hierarchical inheritance
        dog.setAge(7);
        System.out.println(dog.getAge());
        Cat car=new Cat();
        car.setName("Marco");
        System.out.println(car.getName());
        //Student student1=new Student(); // no need to import because it is in same package
        
    
        Child child=new Child();// o/p is-> Grantparent Constructor is called
                                            //Parent Constructor is called
                                            //Child Constructor is called
       System.out.println(child.hasSuperPowers()); // false
        
        child.childMethod();
        System.out.println();
        System.out.println();
        
        Child child2=new Child("Ram", 23);// paramaterised constructor
       System.out.println(child2.getAge()); 
        child2.childMethod();


    }
}
