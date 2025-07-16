package multithreading_31.locking_5.fairness_of_lock_2;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
// fairness means the order in which threads are executing
public class FairnessLockExample {
    private final Lock lock = new ReentrantLock(true);

    public void accessResource() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock.");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        FairnessLockExample example = new FairnessLockExample();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };

        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        Thread thread3 = new Thread(task, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
// o/p 1-> 
// Thread 1 released the lock.
// Thread 3 acquired the lock.
// Thread 3 released the lock.
// Thread 2 acquired the lock.
// Thread 2 released the lock.
// this is random order (regardless of fair -true -> it depends on the orderin which they are requested)

// if we have to do in which order they arae write then we have to write thread.sleep after that
// starvation-> if any thread cannot get access throught the execution

//  Disadvtanges of the Synchronization:
// no Fairness
// no intereptibility
// indefinite blocking
// no read/write blocking


