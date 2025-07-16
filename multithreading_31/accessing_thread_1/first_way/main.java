
// notes-> https://engineeringdigest.medium.com/multithreading-in-java-39f34724bbf6


package multithreading_31.accessing_thread_1.first_way;
//When a Java program starts, one thread begins running
// immediately, which is called the main thread. This thread is
// responsible for executing the main method of a program.

//     To create a new thread in Java, you can either extend the
// Thread class or implement the Runnable interface.

// • A new class World is created that extends Thread.
// • The run method is overridden to define the code that
// constitutes the new thread.
// • start method is called to initiate the new thread


public class main {
    public static void main(String[] args) {
       // System.out.println("Hello");
    //System.out.println(Thread.currentThread().getName()); o/p->main

    world world1=new world();
    world1.start();


    for( ; ;){
        System.out.println("Hello");
    }
    // now hello and world prints randomly







    }

}
