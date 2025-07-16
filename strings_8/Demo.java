package strings_8;

public class Demo {
    public static void main(String[] args) {
        String names="Rohit";
        System.out.println(names);
        System.out.println();
        // string is nothing but sequence of characters 
        // string is noa a primitive data type it is basically a class represents character strings.
        // string is immutable (not changable) in java 
        // as string is a class and everything in java is around class
        // class-obj e.g.

        Student student = new Student();
        student.name="Vijay";
        student.roll_no=45;
        student.address="Mumbai";
        student.division='A';
        System.out.println(student.name);
        System.out.println();
        System.out.println();
        
        // int a=1; //here memory that allocated for one in same it stores value
        // Student student = new Student(); // here student is a reference variable and it stores address of memeory location due to creation of object and that memory is heap memory

        // two types of creating / writing strings
        // 1 . String address="Panvel";
        // 2 . String address=new String("Panvel");



        // Euality in string reference 

        String x="Ram"; // first time memory alloted
        String a=new String("Ram");
        String b=new String("Ram");
        String c="Ram";
        String d="Ram";
        System.out.println(a==b);// false due to a&b are pointing to the two different memory locations 
        System.out.println(c==d);// c&d pointing to same memory pull of Ram string
        System.out.println();
        System.out.println();
        
        
        
        
        
        //String Methods

        // method means code that do something

        // to apply any method just add . after that variable

        String surname= "potdar ";// also calculates space  
        // to find length
       int l= surname.length();
        char i=surname.charAt(1);// index start from 0 to n-1
       System.out.println(l);
       System.out.println(i);
       System.out.println();
       System.out.println();

        // method to check string equality (equal method)

        String car_brand= "BMW";
        String bike_brand= "BMw";
        System.out.println(car_brand.equals(bike_brand));
        System.out.println(car_brand.equalsIgnoreCase(bike_brand)); // car_brand & bike_brand are variables
        System.out.println();
        System.out.println();

        // compare to method

            // String str1="AMAN";
            // String str2="BHUWAN";
            // // here ascii value of A is 65 and og B is 66 so 65-66 = -1
            // int k=str1.compareTo(str2);
            // System.out.println(k);
            // System.out.println();
            // System.out.println();
           
            // String str1="BHUWAN";
            // String str2="AMAN";
            // // here ascii value of A is 65 and of B is 66 so 66-65 = 1
            // int k=str1.compareTo(str2);
            // System.out.println(k);
            // System.out.println();
            // System.out.println();


            String str1="AMAN";
            String str2="AMAN";
            // here ascii value of A is 65  65-65 = 0
            int k=str1.compareTo(str2);
            System.out.println(k);
            System.out.println();
            System.out.println();



        //    int k=str1.compareToIgnoreCase(str2);  also used


        // substring method

        String name="Shyam Sharma";
        String name1=name.substring(2);
        String name2=name.substring(6, 10);// it excludes 10th index

        System.out.println(name1);
        System.out.println(name2);
        System.out.println();
        System.out.println();

        //upppercase-lowercase
        String name3=name.toUpperCase();
        System.out.println(name3);
        
        System.out.println();
        System.out.println();


        // trim method // skips starting and ending unnecessary space\
        String name4=name.trim();
        System.out.println(name4);
        System.out.println();
        System.out.println();


        // replace method

        String name5="Rohit Potdar";
        String name6=name5.replace("Potdar", "Sharma").toUpperCase();
        System.out.println(name6);
        System.out.println();
        System.out.println();
        //also we can replace single character


        //contains method
        System.out.println(name5.contains("Pot"));
        System.out.println();
        System.out.println();
        
        // also starts with- endwith
        // isEmpty() -> ""-> true & isBlank() -> "  " -> true (also considers space )

        // also index of - last index of and more


        // Static Methods
        // we can't use object to access methods we use class to access e.g String
        // convert to string

        int o=10;
        String s=String.valueOf(o);
        System.out.println(s);
        System.out.println();
        System.out.println();

        String formatstr=String.format("My name is %s & i am %d years old", "Rohit",20);
        System.out.println(formatstr);
        System.out.println();
        System.out.println();


        // substring amd subsequence is same in java 


        System.out.println(x);// only to remove warning



    }
}
