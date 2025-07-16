package Collections_Framework_and_Streams_Masterclass_35.Set_7;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;
public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {    
        // Thread-Safe
        // Copy-On-Write Mechanism
        // No Duplicate Elements
        // Iterators Do Not Reflect Modifications

        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>(); // for comparision
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 1; i <= 5; i++) {
            copyOnWriteSet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("Initial CopyOnWriteArraySet: " + copyOnWriteSet); // Initial CopyOnWriteArraySet: [1, 2, 3, 4, 5]
        System.out.println("Initial ConcurrentSkipListSet: " + concurrentSkipListSet); // Initial ConcurrentSkipListSet: [1, 2, 3, 4, 5]

        System.out.println("\nIterating and modifying CopyOnWriteArraySet:");
        for (Integer num : copyOnWriteSet) {
            System.out.println("Reading from CopyOnWriteArraySet: " + num); 
            // Attempting to modify the set during iteration
            copyOnWriteSet.add(6);
        }
        // o/p 

        // it is consistent so it now added cal while iterating
        /*
Iterating and modifying CopyOnWriteArraySet:
Reading from CopyOnWriteArraySet: 1
Reading from CopyOnWriteArraySet: 2
Reading from CopyOnWriteArraySet: 3
Reading from CopyOnWriteArraySet: 4
Reading from CopyOnWriteArraySet: 5
        */   
        


        System.out.println("\nIterating and modifying ConcurrentSkipListSet:");
        for (Integer num : concurrentSkipListSet) {
            System.out.println("Reading from ConcurrentSkipListSet: " + num);
            // Attempting to modify the set during iteration
            concurrentSkipListSet.add(6);
        }

        // o/p 
        // it is weakly consistent to it may add or may be not
        /*
Iterating and modifying ConcurrentSkipListSet:
Reading from ConcurrentSkipListSet: 1
Reading from ConcurrentSkipListSet: 2
Reading from ConcurrentSkipListSet: 3
Reading from ConcurrentSkipListSet: 4
Reading from ConcurrentSkipListSet: 5
Reading from ConcurrentSkipListSet: 6
         */




    }
}
