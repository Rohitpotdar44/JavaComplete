package multithreading_31.thread_methods_3.setDeamon_6;
// user threads are taking in consideration via JVM but deamon threads are runs in background and ignored by jvm
public class test extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        test test=new test();
        test.setDaemon(true);// stops infinite loop of while after some iterations and if it false then loops run infinitely
        test.start();
        System.out.println("Main Done");
    }
}
