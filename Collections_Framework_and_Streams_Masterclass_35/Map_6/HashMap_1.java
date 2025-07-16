package Collections_Framework_and_Streams_Masterclass_35.Map_6;

import java.util.HashMap; /// se package also ( imp for interview)
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_1 {
    public static void main(String[] args) {
        
        HashMap<Integer,String> hashmap=new HashMap<>();
        hashmap.put(1, "Mohit");
        hashmap.put(3, "Rohit");
        hashmap.put(2, "Amit");
        hashmap.put(4, "Sumit");
        System.out.println(hashmap); // o/p -> {1=Mohit, 2=Amit, 3=Rohit, 4=Sumit}
        System.out.println();
        // System.out.println(hashmap.get(2));  // this is not a bettter way to print assign a local varable instead and then print
        String gets = hashmap.get(2);
        System.out.println(gets);
        System.out.println();


        // there is no specific ordering in hashmap
        
        /*

         Expected behavior of HashMap:

HashMap does NOT maintain insertion order.

It also does NOT sort the keys.

Internally, it organizes data based on the hashcode of the keys.

🧠 So why does it look like it's sorted?
It's just coincidence.

In some JVM versions and implementations, if the keys are simple like Integer and the number of entries is small, the hash codes may result in an internal arrangement that looks sorted — but it's not guaranteed.

Try adding more entries or use a more complex set of keys, and you will see that the order becomes unpredictable.
         */


            String gett = hashmap.get(69);
            System.out.println(gett); // o.p is null becaz it is not present
            System.out.println();



        // there is also method about containsKey   and containsValue  both gives result in boolean


        // to run loop inside the hashmap we have to make a use of .keySet() method then apply loop
       
        // set is like a list but duplication is not allowed in it
        Set<Integer> keySet = hashmap.keySet();
        for (Integer i : keySet) {
            System.out.println(hashmap.get(i));
            
        }
        System.out.println();

        // to run loop there is another method also called as .entrySet()

        Set<Map.Entry<Integer, String>> entries = hashmap.entrySet();
        for (Map.Entry<Integer,String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
            
            // to print in uppercase
            entry.setValue(entry.getValue().toUpperCase());
            
        }
        System.out.println();
        System.out.println(hashmap);
   
       

        /*
         Key Characteristics
Unordered: Does not maintain any order of its elements.

Allows null Keys and Values: Can have one null key and multiple null
values.

map.put(null, "Vipul");
map.put(null, “Ram"); 
//  here Vipul is replaced  by Ram


🔁 Example:
java
Copy code
HashMap<Integer, String> hashmap = new HashMap<>();
hashmap.put(1, "Mohit");
hashmap.put(2, "Amit");
hashmap.put(1, "Rohit"); // duplicate key 1
System.out.println(hashmap);
🟩 Output:
Copy code
{1=Rohit, 2=Amit}
The value "Mohit" was replaced by "Rohit" for key 1.




Not Synchronized: Not thread-safe; requires external
synchronization if used in a multi-threaded context.

Performance: Offers constant-time performance (0(1)) for basic
operations like get and put, assuming the hash function disperses
elements properly. (we are not finding elements in loop)
         
        
List<Integer> list = Arrays.askist(2, 4, 52, 43, 4, 432);
list.contains(32); // here it checks one by one

but in map we have .containsKey() which gives us result in O(1) time complexity






---Internal Structure of HashMap---

Basic Components of HashMap--- 


1)Key----- The identifier used to retrieve the value

2)Value ---- The data associated  

3)Bucket ----  in hashmap data is stored inside the array at one index of array kry-value pair is stored 

4)HashFunction--- it takes the key and retireve it's index from the array



A hash function is an algorithm that takes an
input (or "key") and returns a fixed-size string
of bytes, typically a numerical value. The
output is known as a hash code, hash value, or
simply hash. The primary purpose of a hash
function is to map data of arbitrary size to
data of fixed size

Charactristics ----->
-> Deterministic: The same input will always produce the same output.
-> Fixed Output Size: Regardless of the input size, the hash code has a
consistent size (e.g., 32-bit, 64-bit).
-> [Efficient Computation: The hash function should compute the hash
quickly.






How Data is Stored in HashMap ---(.put())---                
Step 1: Hashing the Key    

First, the key is passed through a hash function to generate 
a unique hash code (an integer number). This hash code 
helps determine where the key-value pair will be stored in 
the array (called a "bucket array"). 



Step 2: Calculating the Index 
The hash code is then used to calculate an index in the array (bucket
location) using 

int index = hashCode % arraySize; 

The index decides which bucket will hold this key-value pair. 

For example, if the array size is 16, the key's hash code will be divided by 
16, and the remainder will be the index.



Step 3: Storing in the Bucket
The key-value pair is stored in the bucket at the calculated index. Each
bucket can hold multiple key-value pairs
(this is called a collision handling mechanism, discussed later).



e.g 

map.put("apple”, 50);

-> "apple" is the key.

-> 50 is the value.

-> The hash code of "apple" is calculated.

-> The index is found using the hash code.

-> The pair ("apple", 50) is stored in the
corresponding bucket.




How HashMap Retrieves Data  -----(.get())
 
When we call get(key), the HashMap follows these steps:

Hashing the Key: Similar to insertion, the key is hashed using the same hash
function to calculate its hash code.(Java has inbuilt hash funtion for hashing purpose)

Finding the Index: The hash code is used to find the index of the bucket where
the key-value pair is stored.

Searching in the Bucket: Once the correct bucket is found, it checks for the
key in that bucket. If it finds the key, it returns the associated value.



.... but once we get hashvalue and index then we have to search at that index whether the particular key-val pair is present ,
here is need  for searching beacuse we don't what kind of array it is , whether it stores integer or string , and for multiple input there may be same output ( known as collision) 
beacuse irrespective to the size of input hash function produces finite number of values (so of two i/p there may be same o/p)
and due to collison multiple key value pair can be store at the same index( k1,v1 ) (k2,v2) so to store them it uses linked list ( beacause one ele contains ref of another   )

but consider the the scenario where there are multiple key-val pairs so linked list performed like linear search in that case with complexity O(n)
so by using Self balanced binary search tree ( Red black tree) we can done it in   O(log n) complexity



HashMap Resizing (Rehashing)----


HashMap has an internal array size, which by default is ----16---

When the number of elements (key-value pairs) grows and
exceeds a certain load factor (default is ---0.75---), HashMap
automatically resizes the array to hold more data. This process is
called rehashing.


The default size of the array is 16,(16 * 0.75 =12)  so when more than 12
elements  are inserted, then HashMap will resize.


During rehashing
The array size is doubled.
1.All existing entries are rehashed (i.e., their positions are recalculated)
and placed into the new array.
2.This ensures the HashMap continues to perform efficiently even as
more data is added.




Time Complexity
HashMap provides constant time O(1) performance for basic
operations like put() and get() (assuming no collisions).
However, if there are many collisions, and many entries are
stored in the same bucket, the performance can degrade to O(n),
where n is the number of elements in that bucket.

But after Java 8, if there are too many elements in a bucket,

HashMap switches to a balanced tree instead of a linked list to
ensure better performance O(log n).



Suppose we want to store information
about the number of fruits in a store.
Here's what we want to store:
Fruit   Quantity

Apple   50
Banana  30
Orange  80
Grape   20



*/
        HashMap<String,Integer> hashMap2=new HashMap<>();

        /*
         Internal Process
        The key "Apple" is hashed using its hashCode(). Let's assume "Apple"
        generates a hashCode of 10832233 (this is just an example value).
        The hashCode is used to calculate the index in the internal array (bucket
        array). Let's say the array size is initially 16.
        index = hashCode % arraySize;
        index = 10832233 % 16 = 9;

        This means "Apple" will be stored in bucket 9
         */
        
        hashMap2.put("Apple", 50);
        hashMap2.put("Banana", 30);
        hashMap2.put("Orange", 80);
        hashMap2.put("Grape", 20);

        /*
        hashMap2.put("Banana", 30); 
        index = 13942244 % 16 = 4;

        hashMap2.put("Orange”, 80); 
        index = 19332414 % 16 = 14;  // same index

         hashMap2.put( "Grape", 20);
         index = 548734 % 16 = 14;  // same index



         Since "Orange" is already stored in bucket 14
the HashMap handles the collision by adding
"Grape" to the linked list in bucket 14.
Now, bucket 14 contains two entries:
("Orange", 80) and ("Grape", 20).



            HashMap Structure (Array of Buckets, size: 16)

Index   | Bucket (Key-Value Pairs)
0       |
1
2       |
3
4       | ("Banana", 30)
5 
6       |
7
8       |
9       | ("Apple", 50)
10      |
1
12      |
13      |
14      | ("orange", 80) -> ("Grape", 20) // Collision: stored in a linked list
15      |



        // during  .get() when it called the first of all the hash code is generated then index is calulated and then by help of equals() method it compares the value





         */




    }

}