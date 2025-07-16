package Collections_Framework_and_Streams_Masterclass_35.Stack_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

// Stack extends vector

// Since Stack extends Vector, it is synchronized,
//making it thread-safe.

/*
 LIFO Structure: Stack follows the Last-In-First-
Out (LIFO) principle, where the last element
added is the first one to be removed.

Inheritance: Stack is a subclass of Vector, which
means it inherits all the features of a dynamic
array but is constrained by the stacles LIFO
nature.
 */


public class StackDemo {
    public static void main(String[] args) {
        // Implementation of stack using stack class (Good practice)
       
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(6);
        stack.push(5);
        System.out.println(stack);
         Integer removedElement = stack.pop();
         System.out.println(stack);
         Integer peek = stack.peek();
         System.out.println(peek);
         System.out.println(stack.isEmpty());
         System.out.println(stack.size());

         // searching is done from top to bottom in stack and it uses one based indexing means 0,1,2 like wise
         int searchEle = stack.search(3); // 5 at top so 0,1,2,3(3)
         System.out.println(searchEle);
         System.out.println();


        // Implementation of stack Using linked list as stack 

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        System.out.println(linkedList);
        System.out.println(linkedList.getLast());// peek
        System.out.println(linkedList.removeLast()); //pop 
        System.out.println(linkedList);
        System.out.println(linkedList.size() );
        System.out.println(linkedList.isEmpty());
        System.out.println();
        
        
        // Implementation of stack Using Array list as stack (But not a good practice because we have not dedicated methods )

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); 
        arrayList.add(2); 
        arrayList.add(3); 
        System.out.println(arrayList);
        System.err.println(arrayList.get(arrayList.size()- 1)); // peek
        System.out.println(arrayList.remove(arrayList.size() - 1));// pop
        System.out.println(arrayList);

           
    }
}
