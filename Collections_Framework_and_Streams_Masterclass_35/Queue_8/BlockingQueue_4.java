package Collections_Framework_and_Streams_Masterclass_35.Queue_8;
        // What ever we seen before in queue is not thread safe 
        // But this is thread-safe queue
        // it hepls to bring coordination between the threads
        // wait for queue to become non-empty (wait for to adding something in queue)  / wait for space (wait for clearing memory space to add something)
        // it simplify concurrency problems like producer-consumer
        // standard queue --> operations are implemented immediately
        //  to empty --> remove ( no waiting ) // in std queue
        // to full --> add ( no waiting )  // in std queue


        // In Blocking queue
        // put(add) -->  Blocks if the queue is full until space becomes available
        // take(remove) --> Blocks if the queue is empty until an element becomes available
        // offer(add) --> Waits for space to become available, up to the specified timeout

        // A bounded, blocking queue backed by circular array
        // low memory overhead
        // uses a single lock for both enqueue and dequeue operations 
        // so when  more threads --> problem


        // now are trying to understand threading by using producer consumer problem
import java.util.Comparator;
import java.util.concurrent.*;

class Producer implements Runnable {
    private BlockingQueue<Integer> queue; // both uses shared queue 
    private int value = 0; // initial val is 0 

    public Producer(BlockingQueue<Integer> queue) { // we passed that queue here
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Producer produced: " + value);
                queue.put(value++); //post increment // m=and it waits when more content in queue
                Thread.sleep(1000);
            } catch (Exception e) {
                Thread.currentThread().interrupt(); //good practice
                System.out.println("Producer interrupted");
            }
        }
    }
}


class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer value = queue.take();
                System.out.println("Consumer consumed: " + value);
                Thread.sleep(2000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");
            }
        }
    }
}




public class BlockingQueue_4 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
         Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();
        /*
         Producer produced: 0
Consumer consumed: 0
Producer produced: 1
Producer produced: 2
Consumer consumed: 1
Producer produced: 3
Consumer consumed: 2
Producer produced: 4
Producer produced: 5
Consumer consumed: 3
Producer produced: 6
Producer produced: 7
Consumer consumed: 4
Producer produced: 8
Producer produced: 9
Consumer consumed: 5    // according to their sleep time
         */




         // Now LinkedBlockingQueue

         BlockingQueue<Integer> queue1 =  new LinkedBlockingQueue<>();
         // optionally bounded backed by LinkedList (no boundation it goes upto int.maxSize)
        // Uses two separate locks for enqueue and dequeue operations  (beacsue of linked list)
        // so Higher concurrency between producers and consumers



        //Now PriorityBlockingQueue


        BlockingQueue<String> queue2 = new PriorityBlockingQueue<>(11);  // we can use Comparator.reverorder for reversing
            
         // unbounded
        // Head is based on their natural ordering or a provided Comparator like priority queue
        // put wont block
        queue2.add("apple");
        queue2.add("banana");
        queue2.add("cherry");
        System.out.println(queue2);
        System.out.println(queue2.peek());

    }
}



// but in some scenarious we don't have to block the threads but have to access the queue in that case non blocking thread safe queues comes into picture -> see ConcurrentLinkedQueue