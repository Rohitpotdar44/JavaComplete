package multithreading_31.ExecutorsFramework_10;
// The Executors framework was introduced in
// Java 5 as part of the java.util.concurrent
// package to simplify the development of
// concurrent applications by abstracting away
// many of the complexities involved in creating
// and managing threads.


import java.util.concurrent.Executor;

// Probles arising before Executors framework 
// manual Thread management
// Resource management
// scalability
// Thread Reuse
// Error Handling


// Executive Framework has 3 core interfaces->
// Executor
// ExecutorService
// ScheduledExecutorService

// by using Executive Framework we are able to reuse the threads(or handle things) (according to the resource available ) e.g for printing no from 1 to 9 then usaully 9 threads required , but can also give only three threads using Executive Framework so each thread will handle 3 numbers



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorFramework_1 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(9);// also we can give 3 here
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            // task that you want to perform is write in submit
            executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });

        }
        // if write submit after shutdown then it won't works
        executor.shutdown();
       // shutdown()->Initiates an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted. Invocation has no additional effect if already shut down.
        try {
            // awaitTermination->Blocks until all tasks have completed execution after a shutdown request, or the timeout occurs, or the current thread is interrupted, whichever happens first.
            // to wait final print out state to execute all statements it it prints
            // awaitTermination ->
            executor.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Total time " + (System.currentTimeMillis() - startTime));
    }

    private static long factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;



    }
}
// o/p->
//6
// 2
// 24
// 5040
// 720
// 1
// 362880
// 120
// 40320
// Total time 1023