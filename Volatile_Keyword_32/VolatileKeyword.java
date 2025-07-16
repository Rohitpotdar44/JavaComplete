// This topic comes under thread safety
// each thread has it's local copy of variables which is stored in the cache for the performance reason - but her the flag is shared ( means at one place it ture and false at another so it is problematic)
// so to solve  this problem we make a use of volatile keyword , due to use of this we fetch values directly from the main memory not from cache memory
// but volatie is used for only simple purposes such as to show state change not used for complex purpose
package Volatile_Keyword_32;
 class SharedReference {

    
    public volatile boolean flag=false; // use volatile here
    public void setFlagTrue(){
         System.out.println("Writer thread made the flag true now");
        flag=true;
       
    }
    public void printIfFlagIsTrue(){
        while(!flag){         // if we not use volatile then it reads false (defalult value) all time and never escape this loop and if we use volatile then it uses updated true value and escapes the loop
            //do nothing
        }
        System.out.println("Flag - ture");
    }
    
}
public class VolatileKeyword {
    public static void main(String[] args) {
        SharedReference sharedReference = new SharedReference();
        Thread writerThread =new Thread(() -> {
            try {
                Thread.sleep(1000);;
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
            sharedReference.setFlagTrue();
                });
        Thread readerThread =new Thread(()->sharedReference.printIfFlagIsTrue());
        writerThread.start();
        readerThread.start();

    }
}
