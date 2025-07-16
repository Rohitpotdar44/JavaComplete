package Polymorphism_20.run_time;

public class Dog extends Animal{

        // method overloading
        @Override  // it is a good practice to write  -> it tells us we are overriding right method or not
        public void sayHello(){
            System.out.println("Woof");
        }
    
        public void sayBye(){
            System.out.println("woof woof");
        }





    public static void main(String[] args) {
        Dog dog=new Dog();
       dog.setName("bob");
       System.out.println();
       dog.setAge(4);
       System.out.println(dog.getName());
       System.out.println();
       System.out.println(dog.getAge());
       System.out.println();
       dog.sayHello();
       System.out.println();
        


    }
}
