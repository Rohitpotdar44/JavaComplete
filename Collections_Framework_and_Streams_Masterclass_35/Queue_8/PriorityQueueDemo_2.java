package Collections_Framework_and_Streams_Masterclass_35.Queue_8;
import java.util.PriorityQueue;
public class PriorityQueueDemo_2 {
    
    public static void main(String[] args) {
         // part of the Queue interface
        // orders elements based on their natural ordering (for primitives lowest first)              naturalordering=comparable
        // custom comparator for customised ordering
        // does not allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5); 
        System.out.println(pq); // not sorted   [5, 10, 30, 15]
        while (!pq.isEmpty()){
            System.out.println(pq.poll()); /// this loop removes the first ele in que until queue becomes empty
        }

        // internal working
        // PriorityQueue is implemented as a min-heap by default (for natural ordering)

        // in mean heap the val of node is always less then or equalto node
    }
}
