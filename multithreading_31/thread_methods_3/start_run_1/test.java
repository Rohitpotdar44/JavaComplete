package multithreading_31.thread_methods_3.start_run_1;

public class test extends Thread{
    
    @Override
    public void run() {
       System.out.println("Thread is running.....");
       
    }

    public static void main(String[] args) {
        test test=new test();
        test.start();
    }
}
