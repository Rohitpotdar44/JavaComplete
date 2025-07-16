package Collections_Framework_and_Streams_Masterclass_35.Map_6;
//  navigable map extends sorted map and tree map implements   navigable maps
// so navigable map and sorted map both are interfaces and tree map is  implementation CLASS of  navigable map in terms of sorted map 
// depending upon usage we have to use it if notmal sorting -MAP , if firstKey.lastKey - sorted , nearest val -navi
import java.util.NavigableMap;
import java.util.TreeMap;

/*
 NavigableMap extends SortedMap, providing
more powerful navigation options such as
finding the closest matching key or retrieving
the map in reverse order.




key diff between sorted and navi is in sorted we are finding something in range and in navi in closest




 */
public class NavigableMap_10 {
    public static void main(String[] args) {
            NavigableMap<Integer, String> navigableMap = new TreeMap<>(); 
            navigableMap.put(1, "One"); 
            navigableMap.put(5, "Five"); 
            navigableMap.put(3, "Three"); 
            System.out.println(navigableMap); 
            System.out.println(navigableMap.lowerKey(4)); 
            System.out.println(navigableMap.ceilingKey(3)); // 3 PRSEDENT TO SO 3
            System.out.println(navigableMap.higherEntry(  1)); 
            System. out.println(navigableMap.descendingMap());
    }
}
