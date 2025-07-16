package multithreading_31.thread_methods_3.set_priority_3;

public class test extends Thread{ 
    public test(String name){
            super(name);
    }
    
   @Override
    public void run() {
        for(int i=1;i<=5;i++){
            String a="";
            for(int j=0;j<10000;j++){
                a+=a;
            }

            System.out.println(Thread.currentThread().getName()+"- Priority: "+Thread.currentThread().getPriority()+"- count: "+i);
            try {
                Thread.sleep(100);
            } catch ( InterruptedException e) {
                System.out.println(e);
            }
        }// priority of 3 types 1,5,10
    }

public static void main(String[] args) {
        test L=new test("lOW PRIORITY THREAD");
        test M=new test("MEDIUM PRIORITY THREAD");
        test H=new test("HIGH PRIORITY THREAD");
        
        L.setPriority(MIN_PRIORITY);
        M.setPriority(NORM_PRIORITY);
        H.setPriority(MAX_PRIORITY);

        L.start();
        M.start();
        H.start();

   }
}
