package Collections_Framework_and_Streams_Masterclass_35.Map_6;
import java.util.LinkedHashMap;
import java.util.Map;
// suppose we have to male LRUCache like a linkedhashmap(key,val pair) -> consider it always contains 3 entries and as soon as 4th entry comes it removes
public class LRUCache_4<K,V> extends LinkedHashMap<K,V> {
    private int capacity;

    public LRUCache_4(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache_4<String, Integer> studentMap = new LRUCache_4<>(3);
        studentMap.put("Bob", 99);
        studentMap.put("Alice", 89);
        studentMap.put("Ram", 91);
        studentMap.put("Bob", 100); /// since bob is modified now alice is last recently used
        studentMap.put("Vipul", 89);
        // o/p  {Ram=91, Bob=100, Vipul=89}

        System.out.println(studentMap);
    
       
        //  studentMap.put("Bob",99);
        //  studentMap.put("Alice", 89); 
        //  studentMap.put("Ram", 91); 
        //  studentMap.put("Vipul", 89);
        //  studentMap.get ("Bob");
        //  System.out.println(studentMap); // o/p {Alice=89, Ram=91, Vipul=89}
        
    
    
    }

}   
