package Generics_33.Wildcards_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

//In Java Generics, wildcards (?) are a special kind of
// type argument that can be used in method
// arguments or class definitions to represent an
// unknown type. They allow for more flexible and
// dynamic code by letting the type be specified later
// or be more loosely defined.
public class Main {
    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(12.6,13.5,14.8))); // list is superclass of ArrayList
    }

    // now here we use ? because we have to perform here only read operation and it doesn't retuen anything 
    public void printArrayList (ArrayList<?> list){
            for(Object array:list){
                System.out.println(array);
            }
    }
    // now here we don't use ? because we have to get or write something so it should be of specific type
    public <T> T getFirst( ArrayList <T> list){ 
        return list.get(0);
    }
    /*
     public <T> (before method return type)
This part declares that this method is a generic method and introduces the type parameter T.

Think of this as: “Hey compiler, I’m about to use a placeholder type T inside this method.”

Without this declaration, Java doesn't know what T is.

🔹 T getFirst(...)
Now this part uses the type T that we just declared.

So, once you've said <T>, now you can use T anywhere in that method — as the return type, as the type of parameters, or even inside the body.
    

     */



// if we use ? here then we hvae to use Object here and then we need to type cast - but we use generics to avoid type casting and ensure type safety


// public static int sum (ArrayList<?> numbers) 
// {
// int sum = 0;
// for (Object o: numbers) {
// sum += (int) 0;
// }
// return sum;
// }


// now we to make changes like this

public static double sum (List<? extends Number> numbers) 
{
double sum = 0;
for (Number o: numbers) {
sum += o.doubleValue(); 
}
return sum;
}


// and then to print write this in main method ( which is already written) System.out.println(sum(Arrays.asList(12,13,14)));



// now next concept is upper bound and lower bound


// 1) Upper Bound

// as we previously wrriten , in this code we use the subclasses of Number like int, float, double like wise but String not means we apply boundation to uppper classes from Number ( can't use Number's SuperClass)

// public static double sum (List<? extends Number> numbers) 
// {
// double sum = 0;
// for (Number o: numbers) {
// sum += o.doubleValue(); 
// }
// return sum;
// }


// 2) lower bound

// so here we can use super classes of int like number,obj etc but not it's subclasses ( and there is no subclass of int)

// public static void print Numbers (List<? super Integer> list) {
// for (Object obj : list) {
// System.out.println(obj); 
// }
// }

}
