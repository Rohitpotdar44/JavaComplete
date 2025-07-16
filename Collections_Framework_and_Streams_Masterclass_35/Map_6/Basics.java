package Collections_Framework_and_Streams_Masterclass_35.Map_6;

// That is just like a dictionary where one value refers to the another means just like o walk means chalna (walk=chalna    )

// Map doesn't extends collection , it is a seperate interface
// Map (Separate Interface)
// ├── HashMap
// │   ├── LinkedHashMap
// │   ├── WeakHashMap
// │   └── IdentityHashMap
// ├── Hashtable (legacy)
// ├── SortedMap
// │   └── TreeMap
// │       └── NavigableMap
// ├── ConcurrentMap
//     ├── ConcurrentHashMap
//     └── ConcurrentSkipListMap


// In Java, a Map is an object that maps keys
// to values. It cannot contain duplicate
// keys, and each key can map to at most
// one value. Think of it as a dictionary
// where you look up a word (key) to find its
// definition (value).

// e.g roll no is mapped with name
// Roll Number Name

// 101         Alice Johnson
// 102         Bob Smith

// 103         Charlie Brown
// 104         David Williams
// 105         Eva Thompson


//Map does not extend the Collection interface



/*
 Key Characteristics of the Map Interface-----

Key-Value Pairs: Each entry in a Map consists of a key and a value. ( we are dealing with two values , And in case of array listing list we are building this only business logic means whether it is scheme or which may be in feature but overall we are dealing with only one variable but in case of mac we are living with two values--- Key and value )

Unique Keys: No two entries can have the same key.

One Value per Key: Each key maps to a single value. 

Order: Some implementations maintain insertion order 
(LinkedHashMap), natural order (TreeMap), or no order (HashMap). 
 */



 // 1) First implementation class is hash map ----

public class Basics {
    public static void main(String[] args) {
        
    }
}
