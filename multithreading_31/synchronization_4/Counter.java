package multithreading_31.synchronization_4;

public class Counter {
    
    private int count = 0;
    
    public synchronized void increment () { // so two threads run independently , at  one time one thread is run
    count++; 
    // synchronized(this){
    //     count++;
    // }we can also do that 
    }// this is a critical section because shared resourced are accessed here 
    // and if we not used synchronized then that condition called as a race condition -> when multiple threads works onmultiple resources so their timing may varies the result is also altered -> so we use synchronized keyword to access one thread at a time this is called as mutual exclusion
    public int getCount() {
    return count;
    }
    }
