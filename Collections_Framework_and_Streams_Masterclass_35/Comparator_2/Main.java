package Collections_Framework_and_Streams_Masterclass_35.Comparator_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import Collections_Framework_and_Streams_Masterclass_35.Map_6.comparable_8.Student;


// comparator is used when we have to write our own custom logic (which is not the natural ordering)or we when we have to sort things along multiple things 


class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1,Integer o2) {
        // return o1 - o2; // ascending
        return o2 - o1;
    }


    //int compare(T o1, T o2); it uses this method internally  ( compare outside class)
   // logic for this o1 & o2 is if o1 - o2 is -ve then o1 comes first and if +ve then it comes later and if  0 then select based  on how they come  
    
    
}


 class MyStringComparator implements Comparator<String>  {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }

     
}





public class Main {
    // Comaparator is the interface and with help of it we can perform custom ordering (compare obj of same type and determine it's order)

    /* Natural order of sorting--- asending

        List<Integer> list = new ArraylList<>(); 
        list.add(2); 
        list.add(1); 
        list.add(3);  
        list.sort( null);  //asending ( natural ordering)
        System.out.println(list); 



        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort( null);
        System.out.println(words); // apple ,banana ,date (a,b,d)
     

        // but is we wnat custom logic like sort according to length so string e.g apple -4 like




        /// now to arrange this in descending order we have to make one class with implements Comaparator and write logic



     */
        public static void main(String[] args) {
            List<Integer> list= new ArrayList<>();
            list.add(2);
            list.add(1);
            list.add(5);
            list.sort(new MyComparator());
            System.out.println(list);
            // instead of that all we can also make use of lambda expression it is short and easy
            // list.sort((a,b)->b - a);

        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort(new MyStringComparator());
        System.out.println(words);

        // instead of that all we can also make use of lambda expression it is short and easy
        // words.sort((a,b)->a.length()-b.length());



            // shortcut if we want ascending then as it is o1-o2 is des then  o2-o1

            // ArrayList<Student> lists = new ArrayList<>(); 
            // lists.add(new Student(  "Charlie", 3));
            // lists. add(new Student (  "Bob", 4)); 
            // lists.add(new Student(  "Alice",7)); 
            // lists.add(new Student(  "Akshit", 5)); 
            // lists.sort(null);
            // System.out.println(lists);

            // Exception : Student cannot be cast to class java.lang.Comparable  ( but runs in case of only int like below)


            System.out.println();

            List<Integer> numbers = new ArrayList<>();  
            numbers.add(2); 
            numbers.add(1); 
            numbers.add(99) ; 
            numbers.sort(null); 
            System.out.println(numbers);

        }
}
