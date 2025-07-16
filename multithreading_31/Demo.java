package multithreading_31;

public class Demo {
    // CPU -> brain of program , program runs in cpu
    // core -> it is a individual process unit 
    // cpu has cores
    // program-> set of program
    // process-> instance of the program
    // thread->smallest unit of execution within a process
    // eg. g chrome open 5 tabs so each tab is used as a seperate  thread
    // multitasking->allows an os to ren multiple processess simultaneously -> it happens through os schedular (managing resources within in completely different programs)
    
    // multithreading-> ability to execute multiple threads with in a single core process concurrently(managing resources with in a same program)
    // multithreading enhances efficiency by breaking down individual tasks into sub tasks , and these threads processed simultaneously to improve CPU efficiency
    // e.g assigning different thread for rendering, js handle,useri/p etc.
    // in single core os both thread and processes are managed by schedular through time slicing , coontext swithing etc, to create illusion of cpu handles tasks simultaneously
    // and in multicore both run on difff cores(parallerly)
    // time slicing divides cpu time into smaller intervals
    // context switching-> when process or threads time slice expires the cpu move it's attention to another thread or process
    // multitasking is achieved using multithreading 

    // java supports multithreading -> handled through JVM


    // accessing thread 
    // 1st way
    //• A new class World is created that extends Thread.
//• The run method is overridden to define the code that constitutes the new thread.
//• start method is called to initiate the new threa



}
