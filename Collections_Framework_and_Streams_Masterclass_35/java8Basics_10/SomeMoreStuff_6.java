package Collections_Framework_and_Streams_Masterclass_35.java8Basics_10;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class SomeMoreStuff_6 {
    public static void main(String[] args) {

        // see predicate , consumer takes only one parameter so here we have option to accept two parameters
        
        // BiPredicate, BiConsumer, BiFunction ( can accept 3 parameters)

        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(5, 5)); //true
        BiConsumer<Integer, String> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        System.out.println(biFunction.apply("a", "bc"));//3


        // now in case of predicate instead of having same prarmeters still we have to write Integer twice we for ease there are unary and binary operators
        // UnaryOperator(for predicate), BinaryOperator(for function)
        UnaryOperator<Integer> a = x -> 2 * x;
        BinaryOperator<Integer> b = (x, y) -> x + y;


        // next Topic Is Method Reference


          // Method reference --> use method without invoking & in place of lambda expression
        List<String> students = Arrays.asList("Ram", "Shyam", "Ghanshyam");
        students.forEach(x -> System.out.println(x)); // forEach is the in uilt method and we are making use of lambda expression here
        // but there is also shortcut to lamda expression that is Method Reference 
        // In method reference we are diretly passing method as reference without invoking it (invoking means that (x)) 
        students.forEach(System.out::println);



         // Constructor reference ( see in Streams)
        List<String> names = Arrays.asList("A", "B", "C");
        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).collect(Collectors.toList());










    }
}
class MobilePhone{
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}