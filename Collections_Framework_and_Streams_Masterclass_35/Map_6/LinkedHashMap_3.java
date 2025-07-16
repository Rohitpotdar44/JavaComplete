package Collections_Framework_and_Streams_Masterclass_35.Map_6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// linked hash map extends hashmap
// key diff is order is maintained in linkedhashmap - we get elements in order they are listed
// linked hash map uses --- double linked list ---  to store the insetion order
// but in comaprison with hashmap linked hash map is slightly slower in terms of performance becauase doubly inked lidt uses more memory ,but time complexity remains O(1)
// we use linked hash map when order matters
// like hashmap linkedhashmap is also not thread safe
public class LinkedHashMap_3 {
            
        public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.3f, true); // double linked list
        /*
           initialCapacity--> the initial capacity
           loadFactor     --> the load factor
           accessOrder    --> the ordering mode - {@code true} for access-order, {@code false} for insertion-order(by deafault)     
         */
            // accessOrder: true -> it retures  recently used ele at last  in order , and least recently used one at top              
            
            /*
             e.g
                linkedHashMap.put("Orange", 10);
                linkedHashMap.put("Apple", 20);
                linkedHashMap.put("Guava", 13); // NOT ACCESSED YET - SO COMES TOP IN O/P
                linkedHashMap.get("Apple"); // RECENTLY ACCESSED
                linkedHashMap.get("Orange"); // RECENTLY ACCESSED
            

                o/p 
                Guava: 13
                Apple: 20
                Orange: 10


                // it is very useful in real life , e.g ->  caching eviction strategy - so to clean calche memory least recently one will be deleted

             */

        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 13);

        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Guava");
        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Apple");
        linkedHashMap.get("Guava");

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

        hashMap.put("Shubham", 91);
        hashMap.put("Bob", 80);
        hashMap.put("Akshit", 78);

        Integer res = hashMap.getOrDefault("Vipul", 0); // if present return or return default
        hashMap.putIfAbsent("Shubham", 92); // use if it is not present already
        hashMap.put("Shubham", 92); // now 91 will be replaced by 92
        System.out.println(hashMap);

            }
}
