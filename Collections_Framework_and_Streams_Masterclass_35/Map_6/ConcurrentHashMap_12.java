package Collections_Framework_and_Streams_Masterclass_35.Map_6;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_12 {
    public static void main(String[] args) {
           ConcurrentHashMap<String, Integer> map =  new ConcurrentHashMap<>();
        // Java 7 --> segment based locking --> 16 segments --> smaller hashmaps
        // Only the segment being written to or read from is locked
        // read: do not require locking unless there is a write operation happening on the same segment
        // write: lock

        // java 8 --> no segmentation
        //        --> Compare-And-Swap approach --> no locking except resizing or collision
        // Thread A last saw --> x = 45
        // Thread A work --> x to 50
        // if x is still 45, then change it to 50 else don't change and retry
        // put --> index
        // here when resizing  it not resize like it doubles size it just increase size onr by one

        // Concurrenthash map is the concurrent version of hash map

        // but if we want  MAP that is--> SORTED --> THREAD SAFE -->then we have to use ConcurrentSkipListMap
    }
}
