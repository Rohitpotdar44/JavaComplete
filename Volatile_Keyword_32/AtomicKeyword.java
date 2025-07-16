// see the problem with the volatile keyword is that it only differentiates between states such as flags
// it is not useful in processes ( consider two threads executing at the same time) at that movement we also make a use of synchronized keyword
// but java provides some built in classes such as AtomicInteger etc. which allows process to run independently -> provides thread safety
package Volatile_Keyword_32;

import java.util.concurrent.atomic.AtomicInteger;

class CounterClass {
    // we normally use public int counter= 0; instead of this make a use of AtomicInterger so we get 2000 as o/p all time 
    // in normal case we get o/p as 1875 or some thing but not always 2000
    public AtomicInteger counter =new AtomicInteger(0);
    public  void incrementCounter(){
        counter.incrementAndGet();

    }
    public void getCounter(){
        counter.get();
        System.out.println(counter);
    }
    
}
public class AtomicKeyword {
    public static void main(String[] args) throws InterruptedException {

    
    CounterClass counterClass=new CounterClass();
    Thread t1 =new Thread(()-> {
        for (int i = 0; i < 1000; i++) {
            counterClass.incrementCounter();
        }
    });

    Thread t2 =new Thread(()->{
        for (int i = 0; i < 1000; i++) {
            counterClass.incrementCounter();
        }
    });
    
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    
    counterClass.getCounter();
}
}
