package Collections_Framework_and_Streams_Masterclass_35.java8Basics_10;

import java.util.function.Supplier;

// it just returns data not accept
public class Supplier_5 {
    public static void main(String[] args) {
        Supplier<String> supplierDemo= ()-> "Hello";
        System.out.println(supplierDemo.get()); // Hello
    }
}
