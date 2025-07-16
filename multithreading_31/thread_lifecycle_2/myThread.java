package multithreading_31.thread_lifecycle_2;

public class myThread  extends Thread{

    @Override
    public void run() {
       System.out.println("Running");
        try {
        Thread.sleep( 2000);
        }catch(InterruptedException e) {
            System.out.println(e);
    }
}
        
    public static void main(String[] args) throws InterruptedException {
        
myThread t1 =new myThread();
System. out. println (t1. getState());//new
t1.start();// jvm executes run() method
System. out. println(t1. getState());//runnable
Thread.sleep(100); // go to run()->running
System. out. println(t1. getState());//timed-wating
t1.join();//Waits for this thread to die.
// An invocation of this method behaves in
// exactly the same way as the invocation
// join(0) //  main method waits for t1 to finished
System. out. println(t1. getState()); // terminated
    }
}
