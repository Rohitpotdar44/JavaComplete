package multithreading_31.ExecutorsFramework_10;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import multithreading_31.accessing_thread_1.first_way.main;

public class ScheduledExecutorService_3 {
    // if we want to do any task after a delay (regular interval)
    public static void main(String[] args) {

            // 1)Schedule

//             ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
// scheduler.schedule(
//     () -> System.out.println("Task executed after 5 second delay !"),
//     5,
//     TimeUnit.SECONDS);
// scheduler.shutdown();
//     }

        //2) scheduleatfixedrate

//         ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
// scheduler.scheduleAtFixedRate(
//     () -> System.out.println("Task executed after every 5 seconds !"),
//     5,
//     5,
//     TimeUnit.SECONDS);

// scheduler.schedule(() -> {
//     System.out.println("Initiating shutdown...");
//     scheduler.shutdown();
// },
// 20, TimeUnit.SECONDS);
// }



        // 3)scheduleWithFixedDe1ay()
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(
            () -> System.out.println("Task executed after every 5 seconds !"),
            5,
            5,
            TimeUnit.SECONDS);
        
        scheduler.scheduleWithFixedDelay(
            () -> System.out.println("Task executed after every 5 seconds !"),
            5,
            5,
            TimeUnit.SECONDS);
        
        scheduler.schedule(() -> {
            System.out.println("Initiating shutdown...");
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);





        //** CACHED THREAD POOL */
        // it timely adjust pool size -> if contains low variable   , and short live task 


        

    }



}
