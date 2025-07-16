package Collections_Framework_and_Streams_Masterclass_35.Map_6;
// sorted map is the interface where tree map is it's implementation
/*
 SortedMap is an interface that extends Map and

guarantees that the entries are sorted based on

the keys, either in their natural ordering or by a
specified Comparator.
 */

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Sorted_Map_9 {
    public static void main(String[] args) {
      SortedMap<Integer,String> sortedMap=new TreeMap<>();
       sortedMap.put(4, "Bavesh");
       sortedMap.put(3, "Amit");
       sortedMap.put(7, "Vignesh");
       sortedMap.put(2, "Mohit");
        System.out.println(sortedMap); // {2=Mohit, 3=Amit, 4=Bavesh, 7=Vignesh} sorting based on keys
       // sorted map has following extra methods also such as firstKey ,lastKey ,headmap ,tailMap
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap(7));//exclude 7
        System.out.println(sortedMap.tailMap(3)); // include 3
        

        // and if we have to do custom ordering then we have to do using comparator like SortedMap<Integer,String> sortedMap=new TreeMap<>((a,b)->b-a);

        // Treemap is nothing but redblack tree has time complexity log n
    }
}
