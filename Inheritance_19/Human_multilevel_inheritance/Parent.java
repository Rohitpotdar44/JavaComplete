package Inheritance_19.Human_multilevel_inheritance;

public class Parent extends Grandparent {

    public Parent(){
        super();
        boolean hasSuperPowers=false;
        System.out.println("Parent Constructor is called");
    }

    public Parent(String name, int age){
        super(name,age);
        boolean hasSuperPowers=false;
        System.out.println("Parent Constructor is called");
    }

    public void parentMethod(){
        System.out.println("Parent method is called");
    }

    public static void main(String[] args) {
        Parent parent=new Parent();
        parent.setAge(45);
        System.out.println(parent.getAge());
        
    }
}
