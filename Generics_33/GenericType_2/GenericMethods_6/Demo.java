package Generics_33.GenericType_2.GenericMethods_6;

import javax.print.DocFlavor.STRING;

// Generic Methods are just like constructors but method has return type such as void which is not a case in the constructor
public class Demo {

    public static void main(String[] args) {
        Integer array[] = { 1, 2, 3, 4 };
        printArray(array);
        display(12);// so as it is integer so automatically that method containing int called
        display(12.2);// so here T method called
        display("Rohit");// now T extends String that method is called
    }

    public static <T> void printArray(T[] array) // if we don't use static here then we have to create Demo's obj and
                                                 // then call that printArray method
    {
        for (T elements : array) {
            System.out.print(elements + " ");

        }
    }

    public static <T> void display(T element) {
        System.out.println("Generic display: " + element);
    }

    public static void display(Integer element) // here we hardcoded to integer
    {
        System.out.println("Integer display:" + element);
    }

    public static <T extends STRING> void display(T element) {
        System.out.println("Generic display: " + element);
    }
}
