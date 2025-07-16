package Collections_Framework_and_Streams_Masterclass_35.Queue_8;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
// but in some scenarious we don't have to block the threads but have to access the queue in that case non blocking thread safe queues comes into picture -> see ConcurrentLinkedQueue
// we use add instead of put here
// it uses compare and swap method internally
public class ConcurrentLinkedQueue_7 {
     private static ConcurrentLinkedQueue<String> taskQueue = new ConcurrentLinkedQueue<>();
    public static void main(String[] args) {
       
         Thread producer = new Thread(() -> {
            while (true) {
                try {
                    taskQueue.add("Task " + System.currentTimeMillis());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    String task = taskQueue.poll();
                    System.out.println("Processing: " + task);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        producer.start();
        consumer.start();

    }
}
