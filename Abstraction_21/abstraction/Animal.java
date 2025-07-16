package Abstraction_21.abstraction;
// if we want to declare method only without writing it's definition -> then we hvae to write abstract there (between public and void)-> and also write for that class
// but we can able to write non-abstract(regular) methods in it


public abstract class Animal {

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



    public abstract void sayHello(); // abstract methods
    public void sleep() // concrete methods
    {
        System.out.println("zzz....");
    }

    protected Animal(){
        this.hasSuperPowers=false;
    }






}
