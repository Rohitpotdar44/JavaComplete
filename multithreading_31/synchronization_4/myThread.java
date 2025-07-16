package multithreading_31.synchronization_4;

public class myThread extends Thread{
   
        
        private Counter counter;
        public myThread (Counter counter) {
            this.counter = counter;
            }
   // setting the Counter field using the constructor
            

  @Override
    public void run() {
        for (int i = 0; i < 1000; i++)
        {
            counter.increment();
            
            }
    }



    
}
