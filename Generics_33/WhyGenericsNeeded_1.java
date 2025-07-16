package Generics_33;
// see when we normally creating ArrayList like
//  ArrayList arrayList=new ArrayList();
//         arrayList.add("String");
//         arrayList.add(12);
//         arrayList.add(3.14);
//         String str=(String) arrayList.get(0); // we need to typecast here because it is default object here not like string  or int
//      String str= arrayList.get(1); // othervise we get this error  -> Type mismatch: cannot convert from Object to String
// 
// problem with this approach is - we have to do manual casting , no type safety, no compile time checking - we get error after running but this is not the case in generics

//now to solve this problem we specify type in the syntax itself - called Generics
 
// simple example of ArrayList
/* 
 public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        System.out.println(fruits); // [Apple, Banana]
    }
}
 */


import java.util.ArrayList;

public class WhyGenericsNeeded_1 {
    public static void main(String[] args) {
       
       ArrayList <String> arrayList=new ArrayList<>();
        // arrayList.add(12);// it gives error for other types 
        arrayList.add("Rohit");
          String str=arrayList.get(0);
          System.out.println(str);
    }
}
