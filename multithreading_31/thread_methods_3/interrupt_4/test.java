package multithreading_31.thread_methods_3.interrupt_4;



public class test   extends Thread {
    
    @Override
    public void run() {
        try {
            Thread.sleep(1000);;
            System.out.println("Thread is running");
        } catch (Exception e) {
            System.out.println("Thread Interrupted "+ e);

            // o/p-> Thread Interrupted java.lang.InterruptedException: sleep interrupted
        }
    }

    public static void main(String[] args) {
        test test=new test();
        test.start();
        test.interrupt();
    }
}
