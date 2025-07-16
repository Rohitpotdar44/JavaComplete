package multithreading_31.lambda_Expression_8;
// LambdaExpression is the anonymous function

// how to convert a normal function into the anonymous function i.e LambdaExpression
// public void fun(){
//     System.out.println("Hello");
// }
// from this remove public, void and fun 
// (){
//     System.out.println("Hello");
// }
// now this is the nonymous function

public class LambdaExpression {
    public static void main(String[] args) {
        //*1) Normal way to write therad using runnable interface   (anonymous inner class)

        // Runnable runnable = new Runnable() {
       
        //     @Override
        //     public void run() {
        //     System.out.println("Hello");
        //     }
        //     };
        //     Thread t1 = new Thread(runnable);
        //     t1.start();
    



        //*2)  Using lambda expression
    
        // Anonymous new Runnable() can be replaced with lambda
        // here we are using this because of Runnable is the functional interface 
        // so we removed  public void run


        // Runnable runnable = () ->  System.out.println("Hello"); 
        // Thread t1=new Thread(runnable);
        // t1.start();
    
        // here runnable is the functional interface -> an interface that has single abstract method
    
    

        //*3)if we are not using the lambds expression then we have to do such a lengthy precedure as folllows:

    
        //1]

        // public interface Student {
           
        //     public String getBio(String name);
        //     }


        //2]

        // public class Engineering Student implements Student{

        //     @Override
        //     public String getBio(String name) {
        //     return name + "is Engineering student !";
        //     }
        //     }


        //3]

        // public class Test2 {
        //     public static void main(String[] args) {
        //     EngineeringStudent engineering Student = new Engineering Student();
        //     String ram = engineering Student.getBio ( name: "Ram");
        //     System.out.println(ram);
        //     }
        //     }

        // o/p -> Ramis Engineering student !

        // so we have to write this long katha 


        // Solution:->


        //1] Delete Engineering Student class(ith has no khass it has only one method)

        //2] Modify Test2

        // public class Test2 {
        //     public static void main(String[] args) {
        //     Student engineeringStudent = new Student() {
         // using engineeringStudent as a variable instead of creating a seperate class
        //     @Override
        //     public String getBio(String name) {
        //     return name +" is Engineering student";|
        //     }
        //     };
        //     String bio = engineeringStudent.getBio ( name: "Ram");
        //     System.out.println(bio);
        //     }
        //     }


        // 3] now as student is the functional interface so we can easily convert anonymous function into lambda expression

        // public class Test2 {
        //     public static void main(String[] args) {
        //     Student engineeringStudent = new Student() {
     
        //     @Override
        //     public String getBio(String name) {
        //     return name +" is Engineering student";
        //     }
        //     };
        //     ano fun->


        //     Student lawStudent = (String name) -> {return name + " is law student";};
        //     String bio = engineeringStudent.getBio (name:"Ram");
        //     System.out.println(bio);
        //     }
        //     }

        //    again we able to short it 

            // because in student the return type of the method is same that is String so no need to write it 

            // Student lawStudent = name ->{
            // return name + " is law student";
            // };

            // and if body has only one line then no need to write the brackets

            //  Student LawStudent = name -> System.out.println(name + " is law student");



            // now in our main LambdaExpression class finally we can do this modificcations

            
                // Runnable task1 = () -> System.out.println("Hello"); 
                // Thread t1 = new Thread(task1);
                // t1.start();
                
                // now we are passing same task1 so again we are able to short it

                Thread t1 = new Thread(() -> System.out.println("Hello"));
                t1.start();

    }
    

}
