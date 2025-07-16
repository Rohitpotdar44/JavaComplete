package Collections_Framework_and_Streams_Masterclass_35.Map_6.comparable_8;
 // Comaprable is the way to tell how to perform natural ordering , like student's attendence by their roll no's

import java.util.ArrayList;

// comparable takes one parameter T ( public interface Comparable<T> ) and compare to T with (public int compareTo(T o);) (compare inside class)
 // so we have to rake parameter Student and implement compare method
 // and unlike comaprator , comparable deals ( compareTo ()  w.r.t only one parameter)
public class Comaprable_8 {
    public static void main(String[] args) {
        ArrayList<Student> lists = new ArrayList<>(); 
            lists.add(new Student(  "Charlie", 3));
            lists. add(new Student (  "Bob", 4)); 
            lists.add(new Student(  "Alice",7)); 
            lists.add(new Student(  "Akshit", 5)); 
            lists.sort(null);
            System.out.println(lists);// [Student{name='Alice', rollNo=7}, Student{name='Akshit', rollNo=5}, Student{name='Bob', rollNo=4}, Student{name='Charlie', rollNo=3}]
    }
}
