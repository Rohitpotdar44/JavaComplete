package multithreading_31.synchronization_4;

public class test {
    public static void main(String[] args) {
        Counter counter = new Counter ();
        myThread t1 = new myThread(counter); 
           myThread t2 = new myThread(counter) ;
           t1. start () ;
            t2. start();
            try {
                t1.join();
                t2.join();// to print when previous finished
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(counter.getCount());// now we get random output less than 2000 such as 1899 etc , because two threads use same objects (resource) -> here obj is shared , some times we get 2000 but it is not fixed so add synchronized keyword to method or block
    }
}
//  Disadvtanges of the Synchronization:
// no Fairness
// no intereptibility
// indefinite blocking
// no read/write blocking
