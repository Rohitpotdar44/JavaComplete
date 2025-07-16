package Collections_Framework_and_Streams_Masterclass_35;

public class Basics {
    /*
     * What is a Collection?------
     * A collection is simply an object that
     * represents a group of objects, known as its
     * elements.
     * 
     * 
     * What is a Collection Framework? ----
     * It provides a set of interfaces and classes that
     * help in managing groups of object.
     * 
     * 
     * Before the introduction of the Collection
     * Framework in JDK 1.2, Java used to rely on a
     * variety of classes like Vector, Stack,
     * Hashtable, and arrays
     * to store and
     * manipulate groups of objects.
     * 
     * 
     * However,
     * these classes
     * had several
     * drawbacks
     * 
     * 
     * 
     * • Inconsistency: Each class had a different way of
     * managing collections, leading to confusion and a
     * steep learning curve.
     * 
     * • Lack of inter-operability: These classes were not
     * designed to work together seamlessly.
     * 
     * • No common interface: There was no common
     * interface for all these classes, which meant you
     * couldn't write generic algorithms that could
     * operate on different types of collections.
     * 
     * 
     * To solve these problems, the Collection
     * Framework was introduced.
     * 
     * 
     * Unified architecture: A consistent set of interfaces for all
     * collections.
     * • Inter-operability: Collections can be easily interchanged and
     * manipulated in a uniform way.
     * • Reusability: Generic algorithms can be written that work with
     * any collection.
     * Efficiency: The framework provides efficient algorithms for basic
     * operations like searching, sorting, and manipulation.
     * 
     * 
     * 
     * The Collection Framework is primarily built around a set of
     * interfaces. Important ones are:
     * 
     * 
     * Collection: The root interface for all the other collection types.
     * 
     * List: An ordered collection that can contain duplicate elements (e.g.,
     * ArrayList, LinkedList).
     *
     * Set: A collection that cannot contain duplicate elements (e.g., HashSet,
     * TreeSet).
     * 
     * Queue: A collection designed for holding elements prior to processing (e.g.,
     * PriorityQueue,
     * LinkedList when used as a queue).
     * 
     * Deque: A double-ended queue that allows insertion and removal from both ends
     * (e.g.,
     * ArrayDeque).
     * 
     * Map: An interface that represents a collection of key-value pairs (e.g.,
     * HashMap, TreeMap).
     * 
     * 
     * 
     * ... Hirarchy Structure of Collection Framework
     * 
     * Java Collections Hierarchy
     * ==========================
     * 
     * Iterable
     * └── Collection
     * ├── List
     * │ ├── ArrayList
     * │ ├── LinkedList
     * │ ├── Vector
     * │ ├── Stack
     * │ └── CopyOnWriteArrayList
     * │
     * ├── Set
     * │ ├── HashSet
     * │ ├── LinkedHashSet
     * │ ├── TreeSet
     * │ ├── EnumSet
     * │ ├── ConcurrentSkipListSet
     * │ ├── SortedSet
     * │ └── CopyOnWriteArraySet
     * │
     * └── Queue
     * ├── LinkedList
     * ├── PriorityQueue
     * ├── Deque ──── ArrayDeque
     * │ ├────────── LinkedList
     * │ └────────── ConcurrentLinkedDeque
     * ├── BlockingQueue
     * ├── ArrayBlockingQueue
     * ├── LinkedBlockingQueue
     * ├── PriorityBlockingQueue
     * ├── SynchronousQueue
     * ├── DelayQueue
     * └── ConcurrentLinkedQueue
     * 
     * 
     * 
     * 
     * 
     * Collection extends Iterable
     * so collections contains all Iterable's Methods or properties such as size(),
     * isEmpty() etc. and same for further hierarchy
     * 
     * 
     * The Collection interface is the root interface of the Java
     * Collection Framework. It is the most basic interface that defines
     * a group of objects known as elements. The Collection interface is
     * a part of the java.util package, and It is a parent interface that is
     * extended by other collection interfaces like List, Set, and Queue.
     * 
     * 
     * Since Collection is an interface, it cannot be instantiated directly; rather,
     * it
     * provides a blueprint for the basic operations that are common to all
     * collections.
     * The Collection interface defines a set of core methods that are
     * implemented by all classes that implement the interface. These methods
     * allow for basic operations such as adding, removing, and checking the
     * existence of elements in a collection.
     * 
     * 
     * 
     * 
     * 1) List -------
     * 
     * 
     * The List interface in Java is a part of the java.util package and
     * is a sub-interface of the Collection interface. It provides a
     * way to store an ordered collection of elements (known as a
     * sequence). Lists allow for precise control over where
     * elements are inserted and can contain duplicate elements.
     * 
     * 
     * 
     * Key Features of the List Interface----
     * ->Order Preservation
     * ->Index-Based Access
     * ->Allows Duplicates
     * 
     * 
     * 
     * 
     * 
     *
     * 
     * 
     * 
     * 
     * 
     * 
     */
}
