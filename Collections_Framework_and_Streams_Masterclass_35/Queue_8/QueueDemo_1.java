package Collections_Framework_and_Streams_Masterclass_35.Queue_8;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo_1 {
    /*
     A data structure that works on the FIFO  principle
     ele added at one end and removed at another end(front  )

        // firstly we are seeing usage  of linked list as stack and queue

        // as Stack

    LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addFirst(4);
        linkedList.addFirst(2);
        linkedList.addFirst(6);
        linkedList.addFirst(7); // peak
        System.out.println(linkedList); // [7, 6, 2, 4]
        System.out.println(linkedList.removeFirst()); // 7
        System.out.println(linkedList); // [6, 2, 4]


        now as queue 

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addLast(4); //enqueue (adding )
        linkedList.addLast(2);
        linkedList.addLast(6);
        linkedList.addLast(7); 
        System.out.println(linkedList); // [4, 2, 6, 7]
        System.out.println(linkedList.removeFirst()); // 4     dequeue(deleting)
        System.out.println(linkedList); // [2, 6, 7]
        System.out.println(linkedList.getFirst()); // 2



        now to remove this uncertainity java has built in queue interface

        // it adds from last(enqueue) and removes from first(dequeue)[head] , peek[head]


        // as Queue is the interface we cannot instantiate it directly so we have to use it's implementation class like LinkedList ,Priority Queue

Queue<Integer> list = new LinkedList<>();

list.add(1); // enqueue

list.add(2); // enqueue

list.add(3); // enqueue

System.out.println(list); 1,2,3

Integer i = list.remove(); // dequeue

System.out.println(list); 2,3

list.peek(); // peek  ->2 


Queue<Integer> queue = new LinkedList<>():



now there are alternative methods to (enqueue) add has alternative method offer

(dequeue) add has alternative method poll

peek has element



Queue<Integer> list = new LinkedlList<>();

list.add(1);

//alternative for add

System.out.println(list.size());
System.out.println(list.remove()); // throws exception if empty
System.out.println(list.poll()); // it gives null (better)

// alternative for peek

System.out.println(list.peek()); // gives null
System.out.println(list.element()); // throws exception if empty


but all is depends upon use case


// alternative for add

ArrayBlockingQueue is another implementation class like priorityQueue and linkedList

Queue<Integer> queue? = new ArrayBlockingQueue<>( capacity: 2); //it is array of fixed size
System.out.printin(queve2.add(1)); // true 
System. out.println(queve2.offer( e:2)); // true 


// system.out.printin(queve2.add(3)); // throws exception 
System.out.printin(queve2.offer( e: 3)); // false 


// .add throws exception if it exceeds size and .offer returns true if added and false if no but it not throws exception







     */

     public static void main(String[] args) {
 

        
        
     }



}
