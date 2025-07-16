// it is all about behaviour of linked list as list ( it can also behave as like stack)
package Collections_Framework_and_Streams_Masterclass_35.LinkedList_3;
 // Every element in the linked list called as node
    // each node and two fields 1) Data 2) address or reference or we can say pointer
    // types -> single , doubly, circular



    import java.util.Arrays;

/*
             A LinkedList is a linear data structure where each element is a separate
                object called a node. Each node contains two parts:

                Data: The value stored in the node.

                Pointers: Two pointers, one pointing to the next node (next) and the other
                pointing to the previous node (previous).
             */



             /*
              * As we know that linkedlist is not stored in continuous memory locations so we
              * cannot direct access elements like array so to access element such as I is
              * equal to two then we have to execute one loop that loop starts with one
              * counter such as I is equal to zero and then we have to iterate it and compare
              * whether it is I is equal to one of the it is I is equal to 2 then if we get
              * finally I is equal to two then we stop the search
              * 
                But linked list is very useful in the case of insertion and deletion because
              * we just have to adjust the address of next node
              */


             /*
               Performance Considerations
                LinkedList has different performance characteristics compared to ArrayList:

                Insertions and Deletions: LinkedList is better for frequent insertions and deletions
                in the middle of the list because it does not require shifting elements, as in
                ArrayList.

                Random Access: LinkedList has slower random access (get(int index)) compared
                to ArrayList because it has to traverse the list from the beginning to reach the
                desired index.

                Memory Overhead: LinkedList requires more memory than ArrayList because
                each node in a linked list requires extra memory to store references to the next
                and previous nodes.
               */


import java.util.LinkedList;

/*
     * The LinkedList class in Java is a part of the Collection framework and
       implements the List interface. Unlike an ArrayList, which uses a
       dynamic array to store the elements, a LinkedList stores its elements
       as nodes in a doubly linked list. This provides different performance
       characteristics and usage scenarios compared to ArrayList.
     */

        /*
         Basic Representation of the linked list in code format for | 1 | null |
            public class Test {
                    public static void main(String[] args) {
                    Node node1 = new Node(); 
                    node1.value = 1;
                    node1.next = null;
                    }   
                }       
                    class Node{
                    
                    public int value;
               
                    public Node next; // of node type

                    }   


            // but not need to do this java already provides ua LinkedList

         */


public class Demo {
   
            public static void main(String[] args) {
                LinkedList<Integer> linkedList=new LinkedList<>();
                linkedList.add(1);
                linkedList.add(2);
                linkedList.add(3);
                linkedList.get(2); // 0(n) |
                // more methods other than arrayList
                linkedList.addLast(  4); // 0(1)
                linkedList.addFirst( 0); // 0(1) /// If we do add first in Harry list then it's time complexity will be big O of N because it requires shifting of elements and in case of linked list we have to directly add at first occasion so O(1) same for last 
                linkedList.getFirst(); 
                linkedList.getLast(); 
                System.out.println(linkedList);  // [0,1,2,3,4]

                // also  we have remove method

                linkedList.removeIf(x->x%2==0);
                System.out.println(linkedList);// even numbers are removed now 



                LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","Elephant")); 
                LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog","Lion"));
                animals. removeAll (animalsToRemove);
                System.out.println(animals);
            }
            


             
    }


