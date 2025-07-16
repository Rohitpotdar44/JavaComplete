package Collections_Framework_and_Streams_Masterclass_35.Streams_11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
         // feature introduced in Java 8
        // Streams  process collections of data (e.g ArrayList , Map , etc) in a functional and declarative manner
        // Simplify Data Processing
        // Embrace Functional Programming
        // Improve Readability and Maintainability ( by minimizing size of code)
        // Enable Easy Parallelism ( with complexity of multithreading)

        /// What is stream ?
        /// // it is a interface
        // a sequence of elements supporting functional and declarative programing
        // means when we want to process collections of data (e.g ArrayList , Map , etc) in a functional and declarative manner then we use Streams


        //// How to Use Streams ?
        // Source, intermediate operations & terminal operation


        // e.g without using Steams

        List<Integer> list = Arrays.asList(1,2,3,4);
        // now task is to print how many even numbers are there in the list
        // int count=0;
        // for( int i : list){
        //     if(i%2==0){
        //         count++;
        //     }
        // }
        // System.out.println(count); // 2 



        // now with usage of Streams

        //// How to Use Streams ?
        // Source (list), intermediate operations (.filter()) & terminal operation(.count())

        System.out.println(list.stream().filter(x->x%2==0).count()); // 2
        
        
        // Now Diff methods to Create Streams

        // 1) From collections

        List<String> asList = Arrays.asList("A","B","C");
        Stream<String> stream = asList.stream();

        // 2) From Arrays 

        String[] myarray= {"a","b","c"};
        Stream<String> stream2 = Arrays.stream(myarray);

        // 3) Using Stream.of()

        Stream<String> of = Stream.of("z","x","y");
    
    
        // 4) Infinite Streams

         
        Stream<Integer> stream3 = Stream.generate(() -> 1 );
        List<Integer> iterate = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(iterate);
        
    
    
    }
}
