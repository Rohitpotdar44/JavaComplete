package Generics_33.GenericType_2.Generic_Class;

public class Pair<K,V> {
    private K key;
    private V value;
   public Pair(K key ,V value){
        this.key=key;
        this.value=value;
    }
    public K getkey(){
        return key;
    }
    public V getvalue(){
        return value;
    }
    

    /* Type Parameter Naming Conventions

While you can name type parameters anything, the convention is to use single letters that describe the purpose of the type parameter:

T: Type
E: Element (used in collections)
K: Key (used in maps)
V: Value (used in maps)
N: Number
For example, in the java.util.Map<K, V> interface:

K stands for the key type
V stands for the value type
Map<String, Integer> map = new HashMap<>();
map.put("One", 1);
map.put("Two", 2);  */ 
}
