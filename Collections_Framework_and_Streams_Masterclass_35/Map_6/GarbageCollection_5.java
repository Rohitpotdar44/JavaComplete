package Collections_Framework_and_Streams_Masterclass_35.Map_6;

import java.lang.ref.WeakReference;

/*
 Garbage Collection in Java is the process where the JVM automatically removes objects from memory when they are no longer being used or referenced by any part of the program.
This helps free up memory and avoid memory wastage.

💡 Simple Analogy:
Imagine you're renting a locker (memory) to store a bag (object).
If you lose the locker key (reference) and no one else has it, the locker is uselessly occupied.
So, the staff (JVM) will eventually empty the locker to free up space — that’s Garbage Collection!

 */

class Phone {
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

public class GarbageCollection_5 {
    public static void main(String[] args) {

        // Strong Reference

        // Phone phone=new Phone("i phone", "16 pro max ");
        // System.out.println(phone); // we are getting this due to toString() method
        // phone=null; // now phone is not referenced to that memory so jvm removes obj that memory and clears that memory
        // // here phone is called as storng reference 
        // // in all cases before this all are storng references
        // as soon as strong ref is there jvm doesn't consider it as garbage

        // Weak Reference

         WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Apple", "16 pro max"));
         // here we are passing obj of phone class inside the weak reference container so jvm considered as it is no longer used
        System.out.println(phoneWeakReference.get()); // it prints whatever in Phone by toString()
        System.gc(); // we are suggesting jvm to remove garbage
        try {
            Thread.sleep(5000);  // we are waiting 5 sec 
        } catch (Exception ignored) {
        }
        System.out.println(phoneWeakReference.get());  // then after waiting 5sec we are seeing that whether jv, clears it or not




    }
}
