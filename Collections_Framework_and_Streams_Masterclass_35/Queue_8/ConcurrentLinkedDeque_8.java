package Collections_Framework_and_Streams_Masterclass_35.Queue_8;
import java.util.concurrent.ConcurrentLinkedDeque;
public class ConcurrentLinkedDeque_8 {
    public static void main(String[] args) {
        // non-blocking, thread-safe double-ended queue
        // CAS
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Element1");
        deque.addFirst("Element0");
        deque.addLast("Element2");
        System.out.println(deque); // [Element0, Element1, Element2]

        String first = deque.removeFirst();
        String last = deque.removeLast();
        System.out.println(first);
        System.out.println(last);
    }
}
