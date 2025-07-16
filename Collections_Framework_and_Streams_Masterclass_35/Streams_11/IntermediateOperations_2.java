package Collections_Framework_and_Streams_Masterclass_35.Streams_11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations_2 {
    public static void main(String[] args) {
         // Intermediate operations transform a stream into another stream
        // They are lazy, meaning they don't execute until a terminal operation is invoked.

        // 1. filter
        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam", "Akshit");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
        // no filtering at this point
        long res = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(res); //2
        System.out.println();

        // 2.map
        List<Integer> stringStream = list.stream().map(String::length).collect(Collectors.toList());
        System.out.println(stringStream);
        System.out.println();

        // 3. sorted
        Stream<String> sortedStream = list.stream().sorted();
        List<String> sortedStreamUsingComparator = list.stream().sorted((a, b) -> a.length() - b.length()).collect(Collectors.toList()); //comparator
        System.out.println(sortedStreamUsingComparator);
        System.out.println();
        // 4. distinct
        System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());
        System.out.println();

        // 5. limit
        System.out.println(Stream.iterate(1, x -> x + 1).limit(100).count());

        // 6. skip
        System.out.println(Stream.iterate(1, x -> x + 1).skip(10).limit(100).count());

        // 7. peek
        // Performs an action on each element as it is consumed.
       Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();
       
        /*
         ✅ Simple Meaning of peek() in Java Streams:
👉 peek() is used to look at elements in a stream without changing them.

💡 In simple words:
peek() is like watching what's happening in the stream, step by step, without touching the data.

🔍 Why use it?
To debug a stream (check what elements are flowing through).

To log or print values while processing a stream.


         */


        // 8. flatMap
        // Handle streams of collections, lists, or arrays where each element is itself a collection
        // Flatten nested structures (e.g., lists within lists) so that they can be processed as a single sequence of elements
        // Transform and flatten elements at the same time.
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );
        System.out.println(listOfLists.get(1).get(1)); // 1 ka 1 -> kiwi
        System.out.println(listOfLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());
        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful"
        );
        System.out.println(sentences
                .stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toUpperCase)
                .toList());

    }
}
