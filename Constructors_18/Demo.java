package Constructors_18;

public class Demo {
        public static void main(String[] args) {
            // constructor is the special method used to initialize the object -> 
            // name same as class name -> default constructor -> no parameters -> set default parameters -> e.g age so default valute of age variable is set to 0 because it integer and for string is null
           
           
            // Car car=new Car(); // default constructor
            // System.out.println(car.airbags);// 0 
            // System.out.println(car.company);// null -> BMW (due to overloaded contructor)
            // // here Car() is a default constrctor not a parameterised so it returns default value


            Car car=new Car("M5F90", 6, "BMW", 4);
            System.out.println(car.name);
            System.out.println(car.airbags);
            System.out.println(car.company);
            System.out.println(car.cylinders);
            System.out.println();

            Car car2=new Car("Model S");
            System.out.println(car2.name);
            System.out.println();


        }
}
