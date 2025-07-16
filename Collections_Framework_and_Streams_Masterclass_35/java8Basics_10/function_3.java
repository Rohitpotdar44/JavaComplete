package Collections_Framework_and_Streams_Masterclass_35.java8Basics_10;

import java.util.function.Function;

public class function_3 {
    public static void main(String[] args) {
        // Function is also functional interface similar to Predicate but it do some work for you
        // it has only one abstract method apply()

        Function <Integer,Integer> doubleInt = x -> x*2;
        System.out.println(doubleInt.apply(45));//90

        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(tripleIt.andThen(doubleIt).apply(20)); // same
        System.out.println(doubleIt.compose(tripleIt).apply(20)); // same first triple then double
        System.out.println(doubleIt.apply(100));
        Function<Integer, Integer> identity = Function.identity(); // jo input doge wahi return karega
        Integer res2 = identity.apply(5);
        System.out.println(res2);

}
}