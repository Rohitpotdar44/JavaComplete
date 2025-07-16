package multithreading_31.locking_5.deadlock_4;

public class demo {
//     Deadlock is a situation in multithreading
// where two or more threads are blocked
// forever, waiting for each other to release a
// resource. This typically occurs when two or
// more threads have circular dependencies on a
// set of locks.


// Deadlocks typically occur when four conditions are met
// simultaneously:
// 1. Mutual Exclusion: Only one thread can access a resource at a
// time.
// 2. Hold and Wait: A thread holding at least one resource is waiting
// to acquire additional resources held by other threads.
// 3. No Preemption: Resources cannot be forcibly taken from
// threads holding them.
// 4. Circular Wait: A set of threads is waiting for each other in a
// circular chain.

//A deadlock occurs in concurrent programming when two or more threads are blocked forever, each waiting for the other to release a resource. This typically happens when threads hold locks on resources and request additional locks held by other threads. For example, Thread A holds Lock 1 and waits for Lock 2, while Thread B holds Lock 2 and waits for Lock 1. Since neither thread can proceed, they remain stuck in a deadlock state. Deadlocks can severely impact system performance and are challenging to debug and resolve in multi-threaded applications.



}


