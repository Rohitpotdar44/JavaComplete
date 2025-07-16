package Inheritance_19.Human_multilevel_inheritance;

public class Child extends Parent 
{
    public Child(){
        //Super 
        super();
        boolean hasSuperPowers=false;
        System.out.println("Child Constructor is called");
    }

    public Child(String name,int age){
        //Super 
        super(name,age);
        boolean hasSuperPowers=false;
        System.out.println("Child Constructor is called");
    }



    public void childMethod()
    {   
        super.parentMethod();
        System.out.println("child method called");
       
        
        
    }

    public static void main(String[] args)
     {
        Child child=new Child();
        child.setName("Ajit");
        System.out.println(child.getName());
        
    }

// to run command is 
// javac Inheritance_19\Human_multilevel_inheritance\Child.java
// java Inheritance_19.Human_multilevel_inheritance.Child

    // Super keyword refers it's immediate parent
    // used to invoke super class-> constructors methods or fields
    // always write in the baginning of the bracket


}