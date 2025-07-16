package multithreading_31.locking_5;
// using normal synchronization (without using any lock)

public class Bank_Account extends Thread {
    // lOCK IS A INTERFACE
    // there are two types of locking 1)intrinsic - These are built into every object in Java.You don't see them, but they're there.When you use a synchronized keyword,you're using these automatic locks.
    // 2.Explicit->These are more advanced locks you can control yourself using the Lock class from java.util.concurrent.locks. You explicitly say when to lock and unlock, giving you more control over how and when people can write in the notebook.
    private int balance=1000;
    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw .."+amount);
        if(balance>=amount){
            System.out.println(Thread.currentThread().getName()+" processing with withdrawal ......");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
            balance-=amount;
            System.out.println(Thread.currentThread().getName()+" Withdraw successfull,available balance is  : "+balance);
        }
        else{
            System.out.println(Thread.currentThread().getName()+" Insufficient balance");
        }
    }
}
       

