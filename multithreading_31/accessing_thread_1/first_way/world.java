package multithreading_31.accessing_thread_1.first_way;
// 1st way ///  by extending thread class
public class world extends Thread{

    @Override
    public void run() {
            for( ; ;){
                System.out.println("World");
            }
    }
    
}
