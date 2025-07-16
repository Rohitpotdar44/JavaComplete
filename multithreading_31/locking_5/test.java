package multithreading_31.locking_5;
// using normal synchronization (without using any lock)
public class test {
    public static void main(String[] args) {
        Bank_Account sbi=new Bank_Account();
        Runnable task=new Runnable() {
          //anonymous inner class-> because object of interface can't be created
          @Override
          public void run() {
              sbi.withdraw(454);
              
          }
          
        };
        
        Thread t1=new Thread(task);
        Thread t2=new Thread(task);
        t1.start();
        t2.start();
    }
 // o/p Thread1 attempting to withdraw ...454
// Thread1 processing with withdrawal ...
// Thread1Withdraw successfull,available balance is  : 546
// Thread2 attempting to withdraw ...454
// Thread2 processing with withdrawal ...
// Thread2Withdraw successfull,available balance is  : 92
    
 ///////   but using  this t2 has to wait to complete t1 , and if t1 now runs then t2 also now runs it still waits , so it needs to fix using lock
// here we are using the synchronization only

}
