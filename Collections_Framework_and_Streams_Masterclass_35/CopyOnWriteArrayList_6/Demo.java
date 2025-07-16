package Collections_Framework_and_Streams_Masterclass_35.CopyOnWriteArrayList_6;
 // As we know that array list and linked list are not synchronized ,they are not thread safe, so if we do concurrent modifications then we get inconsistent results 

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//  And in the case of Vector and Stack they are synchronized but we have to apply lock so performance decrease so to solve this issue CopyOnWriteArrayList is developed

// "Copy on Write" means that whenever a write operation

// like adding or removing an element

// instead of directly modifying the existing list

// a new copy of the List is created, and the modification is applied to that copy

// This ensures that other threads reading the List while it’s being modified are unaffected.

// Read Operations: Fast and direct, since they happen on a stable List without interference fron modifications.
// Write operations: A new copy of the List is created for every modification.
// The reference to the list is then updated so that subsequent reads use this new list. 
// notepad --> notepad-copy.
// and when chages made then it's reference is put into modified list

// useful when read operation is more than write
// because for every write it creates new copy file so memory consumption is higher

public class Demo {
    

    public static void main(String[] args) {
        

        // List<String> shoppingList = new ArrayList<>();
        // shoppingList.add("Milk");
        // shoppingList.add ("Eggs");
        // System.out.println("Initial Shopping List: " + shoppingList);
        // for (String item : shoppingList) {
        // System.out.println(item);
        //     // Try to modify the list while reading
        // if (item.equals("Eggs")) { 
        // shoppingList.add( "Butter");
        // }

        // }
        
        
        // System.out.println("Added Butter while reading.");
        // System.out.println("Updated Shopping List:"  + shoppingList);

        // o/p --  Exception in thread "main" java.util.ConcurrentModificationException


        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add ("Eggs");
        System.out.println("Initial Shopping List: " + shoppingList);
        for (String item : shoppingList) {
        System.out.println(item);
            // Try to modify the list while reading
        if (item.equals("Eggs")) { 
        shoppingList.add( "Butter");
        }

        }
        
        
        System.out.println("Added Butter while reading.");
        System.out.println("Updated Shopping List:"  + shoppingList);

        // reading and writing both happens

        // loop purane list pr hi chaelga then purani=new


            // Consider scenario where in our arraylist there are some items then we create new two threads then we have one loop that continuously reads the list and then  while reading we are adding items so if we use array list We get concurrent modification exception and if we use copyonarrayList then it executed successfully 













    }
}
