package Collections_Framework_and_Streams_Masterclass_35.Map_6;

import java.util.EnumMap;
import java.util.Map;

/*
 If all the keys in a Map are values from a single enum, it is recommended
to use an EnumMap as the specific implementation. An EnumMap, which
has the advantage of knowing all possible keys in advance is more
efficient compared to other implementations, as it can use a simple
array as its underlying data structure. 



we not need to resizing like in hashmap , hashvalues are also not needed in enum because we directly known ordinal /index
 */

public class EnumMap_14 {
    public static void main(String[] args) {
        // array of size same as enum
        // [_,"Gym",_,_,_,_,_]
        // no hashing
        // ordinal/index is used
        // FASTER THAN HASHMAP
        // MEMORY EFFICIENT

        // here we are passsing Enum(Day) as a key so in this case instead 

        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY, "Gym");
        map.put(Day.MONDAY, "Walk");
        String s = map.get(Day.TUESDAY);
        System.out.println(map);
        // we we put in any order but enum return in order as mentioned in enum
    }
}
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}