package Inheritance_19.Human_multilevel_inheritance;

public class Grandparent 
{
    private String name;
    private int age;
    private boolean hasSuperPowers;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // how constructors are called

    public boolean hasSuperPowers() {
        return hasSuperPowers;
    }

    public Grandparent(){
        boolean hasSuperPowers=false;
        System.out.println("Grantparent Constructor is called");
    }

    public Grandparent(String name, int age){
        this.age=age;
        this.name=name;
        boolean hasSuperPowers=false;
        System.out.println("Grantparent Constructor is called");
    }


      
    
}
