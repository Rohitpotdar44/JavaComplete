package multithreading_31.locking_5.lock_1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank_Account {

    private int balance = 1000; // Initial balance

    private final Lock lock = new ReentrantLock(); // Reentrant lock

    //no use of synchronized keyword
    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw .. " + amount);
  //   lock.trylock(); Acquires the lock. If the resourse available it locks without waiting -> not requires try-catch
     //  lock.tryLock(amount, null) Acquires the lock if it is free within the given waiting time ,If the lock is not available returns false , in short it waits for specific time if not then return false-> not need to wait indefinitely (in lock.lock() we have to wait indefinitely so this method is not ideal)
        try {
            // Attempt to acquire the lock within 3 seconds
            if (lock.tryLock(3000, TimeUnit.MILLISECONDS)) {
                
                    // Check if balance is sufficient
                    if (balance >= amount) {
                        try {
                            System.out.println(Thread.currentThread().getName() + " processing withdrawal ......");
                            Thread.sleep(3000); // Simulate processing time
                            balance -= amount;
                            System.out.println(Thread.currentThread().getName() + " Withdraw successful, available balance is: " + balance);
                        } catch (Exception e) {
                            Thread.currentThread().interrupt();
                        }
                        finally {
                            // Ensure lock is released
                            lock.unlock();
                        }
                    
                } 
                else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient balance");
                }



            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, try again later");
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
