package Collections_Framework_and_Streams_Masterclass_35.Itrerable_9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



// Iterable is the root interface in the Java Collection Framework that represents a collection of elements which can be iterated one by one using Iterator or enhanced for loop (for-each loop).
// any class that implements Iterable then it has functionality to implement for-each loop
// in ArrayList we are able to implement for-each loop beacuse ArrrayList implements the iterable and iterable weitten implementation of iterator
public class IterableDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // for each loop
        for(int i: list)
        {
        System.out.println(i);
        }
        // intternal working of for each loop
        Iterator<Integer> iterator = list.iterator();
        // iterator has some methods like hasNext(); , next(); ,  
        while (iterator.hasNext()) {

        System.out.println(iterator.next());
        
        }

        // now see remove method

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);

        numbers.add(2);

        numbers.add(3);

        numbers.add(4);

        numbers.add(5);

        // for (Integer number : numbers) {
        // if (number % 2 == 0) {

        // numbers. remove (number) ;

        // }
        // throws concurrent modification exception    -> Exception in thread "main" java.util.ConcurrentModificationException-+



        // so to solve this error we have to use Iterator

        Iterator<Integer> iterator2 = numbers.iterator();
        while (iterator2.hasNext()) {
            Integer num = iterator2.next();
            if(num%2==0){
                iterator2.remove();
            }

        }
        System.out.println(numbers);

        // good thing is we are able to remove ele which iterating


        // also we have this 
         ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()){
            listIterator.next();
//            listIterator.set();
        }




        
        }
    }
