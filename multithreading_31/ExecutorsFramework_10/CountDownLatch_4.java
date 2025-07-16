package multithreading_31.ExecutorsFramework_10;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatch_4 {
    // Used when we want to wait for one or more threads (e.g., to complete tasks before the main method proceeds)
    // It is not reusable when the count becomes 0
    public static void main(String[] args) throws InterruptedException {
        int n = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(n);
        CountDownLatch latch = new CountDownLatch(n);

        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));

        latch.await(); // Wait for all threads to complete
        System.out.println("Main");

        executorService.shutdown();
    }

    // Static inner class to avoid needing an instance of the outer class
    static class DependentService implements Callable<String> {
        private final CountDownLatch latch;

        public DependentService(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public String call() throws Exception {
            try {
                System.out.println(Thread.currentThread().getName() + " service started.");
                Thread.sleep(2000); // Simulate some work
            } finally {
                latch.countDown(); // Decrement the latch count
            }
            return "ok";
        }
    }

    // o/p

// pool-1-thread-2 service started.
// pool-1-thread-3 service started.
// pool-1-thread-1 service started.
// Main




// if we want to reuse countdownlatch then we have to use cyclicbarrier
}


