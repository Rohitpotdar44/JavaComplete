package multithreading_31.thread_methods_3.sleep_2;

public class test extends Thread {



    @Override
    public void run() {
       for(int i=1;i<=5;i++){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           System.out.println(e);
        }   
            System.out.println(i);
    }
    }

    public static void main(String[] args) throws InterruptedException {
        test test=new test();
        test.start();
        test.join();// main method waits and when slwwp is completed then it executes
        System.out.println("Hello");
    }
}
