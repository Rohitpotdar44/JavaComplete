package multithreading_31.thread_methods_3.yield_5;

public class test  extends Thread {
    public test(String name){
        super(name);
    }
    @Override
    public void run() {
       for(int i=1;i<=5;i++){
        System.out.println(Thread.currentThread().getName()+" is running");
        Thread.yield();
       }
       // it gives chance other threads to run
       // result is random
    }
    public static void main(String[] args) {
        test t1=new test("t1");
        test t2=new test("t2");
        test t3=new test("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
