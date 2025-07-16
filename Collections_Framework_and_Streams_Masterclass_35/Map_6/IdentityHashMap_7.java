package Collections_Framework_and_Streams_Masterclass_35.Map_6;

import java.util.IdentityHashMap;
import java.util.Map;

//basic concept if not dealing with obj then it replace 
// if we dealing with obj then it now replace hashcode is diff , but if we override methods then it will replace
// but in case of string class  Even though you didn't override anything, the String class already has it done internally
public class IdentityHashMap_7 {
    public static void main(String[] args) {
        // normal hashmap example

        // in hashmap has class's hashcode(which checks content like "Key   ") if not present it uses object's

        /* 
         String keyl = new String ( "key"); // same keys   
        String key2 = new String( "Key");  // same keys
        Map<String, Integer> map = new HashMap<>(); 
        map.put(keyl, 1); // key 1 
        map.put(key2, 2); // key 2 
        System.out.println(keyl.equals(key2));  // yes they are equal so replace -> so key=2  (now there is only one key and key 1 replced by key 2 so key 2 is o/p)
        System. out.printin(map);   //  output is  {key=2}

        Even though you didn't override anything, the String class already has it done internally, so HashMap can detect equal keys and replace the value.
         */


        // Now in case of indentity hashmap it always deals with that objs hashcode[which deals with memory add] ( it doesn't care about hashcode of your class e.g String) so we can replace

        String keyl = new String(  "key");  
        String key2 = new String(  "key"); 
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        // hashcode and equals 
        map.put(keyl, 1); // key, 1 
        map.put(key2, 2); // key, 2 
        System.out.println(map) ;  // {key=1, key=2}
    
         System.out.println(System.identityHashCode(keyl));  // diff
        System.out.println(System. identityHashCode (key2)); //diff
        System. out.println(keyl.hashCode()); //same
        System.out.println(key2.hashCode()); //same


    
        // if by chance in case of indentityhash map if hashcode comes similar then Identityhashcode() method use == uses instead od .equals and theie reference is checked
    }
}
