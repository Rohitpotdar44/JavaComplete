package multithreading_31.accessing_thread_1.second_way;


// 2nd wa by implementing Runnable interface
public class world implements Runnable {
    public static void main(String[] args) {
       
    }

    @Override
    public void run() {

        for( ; ;){
            System.out.println("World");
        }

//         • A new class World is created that implements Runnable.
// • The run method is overridden to define the code that
// constitutes the new thread.
// • A Thread object is created by passing an instance of world
// • start method is called on the Thread object to initiate the new thread.
 

      
      
    }
}
