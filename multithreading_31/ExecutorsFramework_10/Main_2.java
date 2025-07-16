package multithreading_31.ExecutorsFramework_10;
// execute one by one from top to bottom
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main_2 {
     public static void main(String[] args) throws ExecutionException, InterruptedException {
        
        // ExecutorService executorService = Executors.newSingleThreadExecutor();  //->ExecutorService Initialization:
        // Future<?> future = executorService.submit(() -> System.out.println("Hello"));  //->Submitting a Task:
        // System.out.println(future.get()); //->Retrieving the Result:
        // executorService.shutdown();//->Shutting Down the ExecutorService:

        // o/p hello
            // null

       
            //     ExecutorService executorService = Executors.newSingleThreadExecutor();
        // Future<?> future = executorService.submit(() -> System.out.println("Hello")); // runnable parameter
        // System.out.println(future.get()); // blocking call ( null ) , beacuse of ?
        // if(future.isDone()){
        //     System.out.println("Task is done !");
        // }
        // executorService.shutdown();

        // o/p 
        // Hello
        // null
        // Task is done !



               
            //     ExecutorService executorService = Executors.newSingleThreadExecutor();
        // Future<?> future = executorService.submit(() -> System.out.println("Hello")); // runnable parameter
     

        // if(future.isDone()){
        //     System.out.println("Task is done !");
        // }

                // System.out.println(future.get()); // blocking call ( null ) , beacuse of ?
        // executorService.shutdown();

        // here Task is done not runs because future.get() waits , so it is better to write if statement after future.get()

        // o/p 
        // Hello
        // null




        // ExecutorService executorService = Executors.newSingleThreadExecutor();
        // Future<String> future = executorService.submit(() -> "Hello"); // callable parameter
        // System.out.println(future.get()); // blocking call -> not null because we passed string there
        // if(future.isDone()){
        //     System.out.println("Task is done !");
        // }
        // executorService.shutdown();

        //Hello
        //Task is done !
        




        // ** Runnable and callable  -> these are the two types of the submit()
        // if we don't want to return anything then we use runnable ( ? in future)
        //  if we  want to return anything then we use callable ( specified data type in future)

        //Runnable->

        // ExecutorService executorService = Executors.newSingleThreadExecutor();
        // Future<?> future = executorService.submit(() -> System.out.println("Hello")); 
        // System.out.println(future.get()); 
        // executorService.shutdown();

      // here future has status only -> has boolean value ture or false , cancelled or not etc -> e.g run or not run
        // and future.get() also returns nothing here so automatically runnable will be run here
        //     Future<?> submit(Runnable task);


        // Callable->

        // ExecutorService executorService = Executors.newSingleThreadExecutor();
        // Callable<String> callable=()->"Hello";
        // Future<String> future = executorService.submit(callable); 
        // System.out.println(future.get()); 
        // executorService.shutdown();

        //  <T> Future<T> submit(Callable<T> task);

        // Hello



        // ** Difference between runnable and callable

        // Runnable

        // 1) we don't return anything
        // 2) we have run() method after implementing runnable
        // 3) we cannot throw exception -> so we have to write Thread.sleep() inside the try-catch block

        // callable

        // 1)return
        // 2) call()
        //3) throws




        // ** submit (Runnable task, T result) method 



            //Submits a Runnable task for execution and returns a Future
// representing that task. The Future's get method will return the given
// result upon successful completion.

        // ExecutorService executorService = Executors.newSingleThreadExecutor();
        //A Future represents the result of an asynchronous computation. Methods are provided to check if the computation is complete, to wait for its completion, and to retrieve the result of the computation.
        // Future<?> future = executorService.submit(() -> System.out.println("Hello")); 
        // System.out.println(future.get());
        //executorService.shutdown();
        // executorService.submit(()->System.out.println("Hello"),"Success"); //->Attempting to Submit a New Task After Shutdown:
        // o/p 
        //Hello
        //null
       // Hello


//        ExecutorService executorService = Executors.newSingleThreadExecutor();

// // First task
// Future<?> future1 = executorService.submit(() -> System.out.println("Hello"));
// System.out.println(future1.get()); // Prints null (since Runnable doesn't return a value)

// // Second task with a result
// Future<String> future2 = executorService.submit(() -> System.out.println("Hello"), "Success");
// System.out.println(future2.get()); // Prints "Success"

// executorService.shutdown();

        // o/p 
        // Hello
        // null
        // Hello
        // Success



        //** isShutdown() method */

//         ExecutorService executorService = Executors.newFixedThreadPool(  2);
//       Future<Integer> submit =executorService.submit(() -> 1 + 2);
//       Integer i =submit. get();
//         System.out.println("Sum is"+i);
//         executorService.shutdown() ;
// System.out.println (executorService .isShutdown());

//o/p 
// Sum is3
// true


        // ** isTerminated() method 

//         ExecutorService executorService = Executors.newFixedThreadPool(  2);
//         Future<Integer> submit =executorService.submit(() -> 1 + 2);
//         Integer i =submit. get();
//           System.out.println("Sum is"+i);
//           executorService.shutdown() ;
//   System.out.println (executorService .isTerminated());

     //Sum is3
// false



// ExecutorService executorService = Executors.newFixedThreadPool(  2);
// Future<Integer> submit =executorService.submit(() -> 1 + 2);
// Integer i =submit. get();
//   System.out.println("Sum is"+i);
//   executorService.shutdown() ;
//   Thread.sleep(1000);
// System.out.println (executorService .isTerminated());

// Sum is3
//true




        // ** invokeAll() method() -> it takes collection of tasks and and executes together

        // invokes don't go ahead until all tasks are complemented fully 


         //* Future */

                // future.get()-> wait
                // future.Done()-> if task is completed then it returns true
                // future.get(timeout)-> it waits for the specific time , is task is not complted with in that timr then it gives timeout exception
                // future.cancel()->but task is not interrupted


                


    }
}
