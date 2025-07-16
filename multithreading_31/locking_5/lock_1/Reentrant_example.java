package multithreading_31.locking_5.lock_1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
// ReentrantLock is used to avoid deadlock stuation , here if we not use ReentrantLock then there is deadlock because both methods are depends on completion of one another
public class Reentrant_example {
   private final Lock lock=new ReentrantLock();
   public void outerMethod(){
    lock.lock();//1
   // lock.lockInterruptibly(); make another method to wait indefinitely util current method not completed
    try{
        System.out.println("This is outer method");
        innerMethod();
    }
    finally{
        lock.unlock();//4
    }
   }

   public void innerMethod(){
    lock.lock();//2
    try{
        System.out.println("This is inner method");
    
    }
    finally{
        lock.unlock();//3
        
    }
   }

   public static void main(String[] args) {

    Reentrant_example reentrant_example=new Reentrant_example();
    reentrant_example.outerMethod();
   }

}
