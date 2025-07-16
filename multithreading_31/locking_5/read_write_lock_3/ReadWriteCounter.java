package multithreading_31.locking_5.read_write_lock_3;
//A Read-Write Lock is a concurrency control mechanism that allows multiple threads to read shared data simultaneously while restricting write access to a single thread at a time. This lock type, provided by the ReentrantReadWriteLock class in Java, optimizes performance in scenarios with frequent read operations and infrequent writes. Multiple readers can acquire the read lock without blocking each other, but when a thread needs to write, it must acquire the write lock, ensuring exclusive access. This prevents data inconsistency while improving read efficiency compared to traditional locks, which block all access during write operations.
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
// when no thread is writing then no of threads can read at a time , but when situation is reverse then no one can read
public class ReadWriteCounter {
    private int count = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increment() {
        writeLock.lock();
        try {
            count++;
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock();// main adv is multiple threads can read at a time (no bounded waiting is here)
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteCounter counter = new ReadWriteCounter();

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " read: " + counter.getCount());
                }
            }
        };

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    counter.increment();
                    System.out.println(Thread.currentThread().getName() + " incremented");
                }
            }
        };

        Thread writerThread = new Thread(writeTask);
        Thread readerThread1 = new Thread(readTask); // two threads are reading
        Thread readerThread2 = new Thread(readTask);

        writerThread.start();
        readerThread1.start();
        readerThread2.start();

        writerThread.join();// threads waiting for the others completion
        readerThread1.join();
        readerThread2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}


// o/p 
// Thread-0 incremented // writer (lock then unlocked -> then two readers execute then again write as like -> bu again execution priority is also depends on the CPU execution)
// Thread-2 read: 1  // r
// Thread-1 read: 1  //r
// Thread-0 incremented
// Thread-2 read: 2
// Thread-1 read: 2
// Thread-0 incremented
// Thread-1 read: 3
// Thread-2 read: 3
// Thread-0 incremented
// Thread-1 read: 4
// Thread-2 read: 4
// Thread-0 incremented
// Thread-2 read: 5
// Thread-1 read: 5
// Thread-0 incremented
// Thread-2 read: 6
// Thread-1 read: 6
// Thread-0 incremented
// Thread-2 read: 7
// Thread-1 read: 7
// Thread-0 incremented
// Thread-2 read: 8
// Thread-1 read: 8
// Thread-0 incremented
// Thread-2 read: 9
// Thread-1 read: 9
// Thread-0 incremented
// Thread-2 read: 10
// Thread-1 read: 10
// Final count: 10