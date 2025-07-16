package Collections_Framework_and_Streams_Masterclass_35.Map_6;
//it is used when we have to Use map which trade safe as well as sorted 


// SkipList is kind of one data structure

/*
probabilistic data structure
that allows for efficient search,
insertion, and deletion operations.

It is similar to a sorted linked list but with
multiple layers that "skip" over portions of the
list to provide faster access to elements.



cosider list 1,2,3,4,5,6,7,8,9




at layer 3)  -->> 1,.............5,.............9  (some more ele skipped)
at layer 2) -->> 1, ....3,.....5,.......7,......9 ( some ele skipped)
at layer 1)-->>> 1,2,3,4,5,6,7,8,9   (all ele present)


Consider we have to search element 2 , Then from layer 3 we  are able to see that 2 is less than 5 so again we explore layer 2 where 2 is less than 3 so again we explore layer 1 and finally we got element 2,,, so it is faster than linear search and some elements are also skipped so it is easier to data entry
Do you hear there is no strict rules but in case of red blank tree there are compulsions that every iteration should be sorted



concurrent skip list the map is the concurrent version of tree map 




 */

public class ConcurrentSkipListMap_13 {
    // all methods similat to map
    // but more usage in multithreaded environment  

        // You can add only up to 10 key-value pairs in Map.of(k1, v1, ..., k10, v10)


    /*
     Map<Integer, String> map = Map.ofEntries(
    Map.entry(1, "A"),
    Map.entry(2, "B"),
    Map.entry(3, "C"),
    // ...add more than 10 entries
    Map.entry(11, "K")
);
     */
}
