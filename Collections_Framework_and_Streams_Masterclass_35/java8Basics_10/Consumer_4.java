package Collections_Framework_and_Streams_Masterclass_35.java8Basics_10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// it just takes values and just prints but not return any thing (doesn't gives anthing)
public class Consumer_4 {
    public static void main(String[] args) {
        Consumer<Integer> print = x -> System.out.println(x); //51
        print.accept(51);
        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = x -> {    // it consumes list of integers here
            for (int i : x) {
                System.out.println(i);
            }
        };
        printList.accept(list); // 1 2 3
    }
}
