package Collections_Framework_and_Streams_Masterclass_35.Queue_8;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
// here things are sorted
/*
 // each insert operation must wait for a corresponding remove operation by another thread and vice versa (once inseted then it waits for removal before next insert)
// it cannot store elements, capacity of at most one element 
 */
public class SynchronousQueue_5 {
     public static void main(String[] args) {
        BlockingQueue<String> queue = new SynchronousQueue<>();
        Thread producer = new Thread(() -> {
            try {
                System.out.println("Producer is waiting to transfer...");
                queue.put("Hello from producer!");
                System.out.println("Producer has transferred the message.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Producer was interrupted.");
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                System.out.println("Consumer is waiting to receive...");
                String message = queue.take();
                System.out.println("Consumer received: " + message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Consumer was interrupted.");
            }
        });
        producer.start();
        consumer.start();

        // o/p

        /*
         Consumer is waiting to receive...
        Producer is waiting to transfer...
        Producer has transferred the message.
        Consumer received: Hello from producer!
         */


}
}   