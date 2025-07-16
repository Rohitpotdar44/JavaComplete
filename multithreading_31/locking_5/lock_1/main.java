package multithreading_31.locking_5.lock_1;

public class main {
    public static void main(String[] args) {
        Bank_Account sbi=new Bank_Account();
        Runnable task=new Runnable() {
          //anonymous inner class-> because object of interface can't be created
          @Override
          public void run() {
              sbi.withdraw(454);
              
          }
          
        };
        
        Thread t1=new Thread(task,"Thread1");
        Thread t2=new Thread(task,"Thread2");
        t1.start();
        t2.start();
    }
}
// o/p
// Thread1 attempting to withdraw .. 454
// Thread2 attempting to withdraw .. 454
// Thread1 processing withdrawal ......
// Thread2 could not acquire the lock, try again later
// Thread1 Withdraw successful, available balance is: 546