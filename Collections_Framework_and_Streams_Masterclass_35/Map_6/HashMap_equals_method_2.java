package Collections_Framework_and_Streams_Masterclass_35.Map_6;

import java.util.HashMap;

class Car {
    private String name;
    private int id;

    public Car(String name,int id){
        this.name=name;
        this.id=id;
    }

   public String getName(){
    return name;
   }

   public int getid(){
    return id;
   }



    
    
}


public class HashMap_equals_method_2 {
    public static void main(String[] args) {
        HashMap<Car,String> hashMap=new HashMap<>();
        Car car=new Car("Punch", 5);  
        Car car2=new Car("Harrier", 6);   
        Car car3=new Car("Punch", 5);    
    
        hashMap.put(car, "Micro SUV"); //hashcode 1 -> index 1
        hashMap.put(car2, "SUV");   //hashcode 2 -> index 2
        hashMap.put(car3, "Sedan");  //hashcode 3 -> index 3    
        // for printing toString() requires
        /*
          Why car and car3 (same values) are treated as different keys?

🔴 Why their values are not getting replaced like String keys?

🛑 The Real Reason: You didn’t override equals() and hashCode() in the Car class!
         */
        

        // here we normally think that as "Punch", 5 is same for both then here hashcodes ans index are same , but here 
        // catch is we are dealing with objects(Car car=new Car("Punch", 5); obj creation) and hashcode in obj are deals with memory so each hashcode is diff

        // but to deal with this uncertanity, and in future whenever we write any custom classs then it is mantatory(good practice) to write it's hashCode() and equals() method 

        // this following code basically contians all complete code in that lecture , but i am pasting below to understand that hashCode() and equals() method 




        /*
         package com.engineeringdigest.collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) { 
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 1);

      
        map.put(p1, "Engineer"); // hashcode1 --> index1
        map.put(p2, "Designer"); // hashcode2 --> index2
        map.put(p3, "Manager"); // hashcode1 --> index1 --> equals --> replace

        System.out.println("HashMap Size: " + map.size());
        System.out.println("Value for p1: " + map.get(p1));
        System.out.println("Value for p3: " + map.get(p3));


        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Shubham", 90); // hashcode1 --> index1
        map1.put("Neha", 92); // hashcode2 --> index2
        map1.put("Shubham", 99); // hashcode1 --> index1 --> equals() --> replace

    }

}

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override                             //   Quickly find out where to store them (that's where hashCode() helps).

    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override                               //  Decide if two keys are same or not (that's where equals() helps).

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }

}





// now explanation regarding that two methods for better understanding


✅ First, Why Do We Need hashCode() and equals()?
When we store objects in a HashMap, Java needs to:

Quickly find out where to store them (that's where hashCode() helps).

Decide if two keys are same or not (that's where equals() helps).

🔹 hashCode() Method (Simple Explanation)
Think of hashCode() as a room number where Java stores the object.

If two keys have the same hashCode(), they go to the same room (bucket).

But if their equals() says they are different, they both stay separately in that room.


@Override
public int hashCode() {
    return Objects.hash(name, id);
}
🔸 This means:

You are saying: "Make hash based on the name and id of the person."

So if name and id are same → they will get the same hashCode() (i.e. same room).

🔹 equals() Method (Simple Explanation)
Once Java finds the room using hashCode(), it then checks:
👉 "Is this the same person or just someone with same name/id?"

That’s what equals() does: it checks if two Person objects are really equal.

Your Code:
java
Copy
Edit
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Person other = (Person) obj;
    return id == other.getId() && Objects.equals(name, other.getName());
}
🔸 This means:

If both persons have same id and name, then they are considered equal.

So p1.equals(p3) will return true if both have "Alice", 1.

📌 Why Is This Important in HashMap?
In your example:

java
Copy
Edit
map.put(p1, "Engineer");
map.put(p3, "Manager");
Even though p1 and p3 are two different objects (created with new), their name and id are same.

Because you overrode:

hashCode() → So they go to the same room

equals() → Java now knows they are equal

👉 So "Manager" replaces "Engineer" in the map.











         */

        HashMap<String,Integer> hashMap2=new HashMap<>();
        hashMap2.put("Swift", 1);  //hashcode 1 -> index 1
        hashMap2.put("Lord Alto", 2); //hashcode 2 -> index 2
        hashMap2.put("Swift", 4);  //hashcode 1 -> index 1  --> equals()--> replace()  --> o/p {Lord Alto=2, Swift=4}   
        System.out.println(hashMap2);


        //  Now time complexity of each operation 

        /*
| Operation        | Average-Case Time Complexity   | Worst-Case Time Complexity | Explanation                                                                                                      |
|------------------|-------------------------------|-----------------------------|------------------------------------------------------------------------------------------------------------------|
| put(key, value)  | O(1)                          | O(log n)                    | Inserts a key-value pair. Average: Constant time due to direct bucket access. Worst-Case: O(log n) when bucket  |
|                  |                               |                             | converts to a Red-Black Tree after exceeding collision threshold.                                               |
| get(key)         | O(1)                          | O(log n)                    | Retrieves the value associated with a key. Average: Constant time via direct bucket access. Worst-Case:         |
|                  |                               |                             | O(log n) when searching within a treeified bucket.                                                              |
| remove(key)      | O(1)                          | O(log n)                    | Removes the key-value pair associated with a key. Average: Constant time with direct access. Worst-Case:        |
|                  |                               |                             | O(log n) when removing from a treeified bucket.                                                                 |

| Operation             | Time Complexity | Explanation                                                                                                     |
|-----------------------|------------------|-----------------------------------------------------------------------------------------------------------------|
| containsKey(key)      | O(log n)         | Checks if a key exists in the map. Average: Constant time via direct bucket access. Worst-Case: O(log n)       |
|                       |                  | when searching within a treeified bucket.                                                                      |
| containsValue(value)  | O(n)             | Checks if a value exists in the map. Both average and worst-case are linear time since it may need             |
|                       |                  | to traverse all entries.                                                                                       |
| size()                | O(1)             | Returns the number of key-value pairs. Both average and worst-case are constant time as the size is maintained |
|                       |                  | as a separate field.                                                                                           |
          



*/
    }
}
