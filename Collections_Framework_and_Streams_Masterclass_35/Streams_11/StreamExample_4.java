package Collections_Framework_and_Streams_Masterclass_35.Streams_11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample_4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        Stream<String> stream = names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.length() > 3;
                });

        System.out.println("Before terminal operation"); // first prints this becaz we have not used terminal function yet

        List<String> result = stream.collect(Collectors.toList());

        System.out.println("After terminal operation");
        System.out.println(result);
    }
}
//o/p

/*
 Before terminal operation
Filtering: Alice
Filtering: Bob
Filtering: Charlie
Filtering: David
After terminal operation
[Alice, Charlie, David]
 */