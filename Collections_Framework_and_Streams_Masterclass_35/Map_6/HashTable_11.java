package Collections_Framework_and_Streams_Masterclass_35.Map_6;
// HashTable is the legacy class

import java.util.Hashtable;

// properties ->

/*
 // Hashtable is synchronized

// no null key or value

// Legacy Class but it is replaced by ConcurrentHashMap
// slower than HashMap
// it is thread safe
// all methods are synchronized including .get() means read -> but for reading also we have to wait which is solved in  concurrentHashMap later


it extends to map so includes all map's methods
uses bucket same as map 
on collision -> only linked list


hashtable. put(null, "value"); // Throws exception
hashtable.put(4, null); // Throws exception

 */

public class HashTable_11 {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable=new Hashtable<>();
        Thread thread1=new Thread(() ->{            // only one thread runs at a time   
            for(int i=0; i<1000; i++){
                hashtable.put(i, "Thread 1");
            }
        });
          Thread thread2=new Thread(() ->{
            for(int i=1000; i<2000; i++){
                hashtable.put(i, "Thread 2");
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Size :"+hashtable.size());
    }

    // if we use Hahmap or map here which is nor synchronized then It's not that only one thread wins — it's that both threads are writing, but because of no synchronization, their operations interfere or clash, leading to random losses, not complete loss of one thread’s data.
}
