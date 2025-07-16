package Collections_Framework_and_Streams_Masterclass_35.Set_7;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    /*
      //  Set is a collection that cannot contain duplicate elements
        // faster operations -> in O(1) complexity
        // Map is the interface and these are it's implementation classes --> HashMap, LinkedHashMap, TreeMap, EnumMap
        // Set is the interface  and these are it's implementation classes --> HashSet, LinkedHashSet, TreeSet, EnumSet
        // in set same methods as map just here add instead of put
        
        
        // Set is the type of collection it is not key,val pair
        Set<Integer> set = new HashSet<>();

        internal workinh of hashset ->
        Map<Integer, String> map = new HashMap<>();
        Set<Integer> integers = map.keySet(); // those keys in the map are nothing but the set (that cannot contain duplicate elements)

        only diff is in set there is only keys no val fiels 


        and methods in the set are all of list type


        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(67); 
        System.out.println(set);   // o/p [1, 67, 12]  which is unordered (not in order they are inserted 12,1,67 )

        Now ordered by usage of LinkedHashSet--
        Set<Integer> set = new LinkedHashSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(67); 
        System.out.println(set); //  o/p [12, 1, 7] 
        }

        Now if we want them in sorted manner then use TreeSet
         Set<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(67); 
        System.out.println(set); [1, 12, 67]
        }


        Now if we want to access more methods then use NavigableSet (like ceil , floor etc)
         NavigableSet<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(67); 
        System.out.println(set);
        }



        */



        public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(67); 
        System.out.println(set);
        


        // now all these are not thread safe so in order to make it thread safe

        // there is one way but it is generally not recommended to use 

        // Set<Integer> synchronizedSet = Collections.synchronizedSet(set); // now ori set in not synchro we here wrapped
                                                                         // inside synchro set called as synchronizedSet
                                                                          // , but in actual implementation it requires
                                                                         // synchronization several times , so not
                                                                         // recommended

          // recommended way is to use ConcurrentSkipListSet

          Set<Integer> set1= new ConcurrentSkipListSet<>();
        

          // now unlike unmodifyable maps there are unmodifyable sets also

          Set<Integer> newSet = Set.of(1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19);
          // HERE NO LIMIT OF 10 LIKE HASHMAP

          Collections.unmodifiableSet(null);



        }

      }