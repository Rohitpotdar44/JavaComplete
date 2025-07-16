package Collections_Framework_and_Streams_Masterclass_35.java8Basics_10;

import java.util.function.Predicate;

/*
 A Predicate is a functional interface in Java that:

Represents a condition or test.

Takes one input and returns a boolean (true or false).

📦 It is part of java.util.function package.


it is used when to check conditions

it is used to pass condition in the variable (it holds the condition)

we not need to write lengthy methods

it has only one abstract method .test()

 */
public class Predicate_2 {  
        public static void main(String[] args) {
            Predicate <Integer> isEven= x -> x % 2 == 0;
            System.out.println(isEven.test(8));//true
            Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
            Predicate<String> isWordEndingWithT = x -> x.toLowerCase().endsWith("t");
            Predicate<String> and = isWordStartingWithA.and(isWordEndingWithT);
            System.out.println(and.test("Akshay")); //false


        }
}
