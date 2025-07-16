package Collections_Framework_and_Streams_Masterclass_35.ArrayList_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /*
     * An ArrayList is a resizable array implementation of the
     * List interface. Unlike arrays in Java, which have a
     * fixed size, an ArrayList can change its size
     * dynamically as elements are added or removed. This
     * flexibility makes it a popular choice when the number
     * of elements in a list isn't known in advance.
     */

     
            // Internal Working of ArrayList

           
// Unlike a regular array, which has a fixed size,
// an ArrayList can grow and shrink as elements
// are added or removed. This dynamic resizing
// is achieved by creating a new array when the
// current array is full and copying the elements
// to the new array.


/*
 * 
 * Internally, the ArrayList is implemented as an
array of Object references. When you add
elements to an ArrayList, you're essentially
storing these elements in this internal array.


When you create an ArrayList, it has an initial
capacity (default is 10). The capacity refers
to the size of the internal array that can hold
elements before needing to resize.


Capacity means size of array  that is inside the arrayList  ,  basically how many elements it can store before resizing




         Steps during adding ele -----

         
When we add an element to an ArrayList, the following steps occur

Check Capacity: Before adding the new element, ArrayList checks if
there is enough space in the internal array (elementData). If the array is
full, it needs to be resized.

Resize if Necessary: If the internal array is full, the ArrayList will create
a new array with a larger capacity (usually ****1.5 times**** the current
capacity) and copy the elements from the old array to the new array.
The new element is then added to the internal array at

Add the Element:
the appropriate index, and the size is incremented.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Steps during Resizing ----- 
 * 
 * 

• Initial Capacity: By default, the initial capacity is 10. This means the
internal array can hold IO elements before it needs to grow.

Growth Factor: When the internal array is full, a new array is created
with a size 1.5 times the old array. This growth factor balances
memory efficiency and resizing cost.

Copying Elements: When resizing occurs, all elements from the old
array are copied to the new array, which is an O(n) operation, where
n is the number of elements in the ArrayList.









Removing Elements-------

Check Bounds: The ArrayList first checks if the index is within the
valid range.

Remove the Element: The element is removed, and all elements to
the right of the removed element are shifted one position to the left
to fill the gap.

Reduce Size: The size is decremented by 1.
 * 
 * 
 * 
 * /// consider the secanrio where we are aware about no of ele to be added e.g 1000
 * 
 * ArrayList<Integer> list = new ArrayList<>( initialCapacity: 1000) ;
System.out .printfln (list. size( )):  /// ----- ans is 0
System.out.println(list.get(0)); // exception --- noting is at index 0




Arraylist<Integer> list = new ArraylList<>( initialCapacity: 11);
list.add(1); 
list.add(1); 
list.add(1); 
list.add(1); 
list.add(1); 
list.add(1); 
list.add(1); 
list.add(1); 
list.add(1);  
list.add(1); 
list.add(1); /// 11 ele   before resizing (size 11)
list.add(1); // 12 ele    after resizing ( size = ini cap(11 * 1.5 = int(16.5)= 16))
System.out.printin(list.size); // 16
 * 
 * 
 *  /// there is no default method to print the capacity but we can achieve it through reflection
 * 
 * 
 *  
 */




     public static void main(String[] args) {
         
      // Creation of ArrayList---------------
       

        // 1st Way
      ArrayList<Integer> arrayList=new ArrayList<>();
       
       
        // we can also write it as 


        //2nd Way
        List<String> list = new ArrayList<>(); 
         System.out.println(list.getClass().getName()); 
         System.out.println(" "); // java.util.ArrayList -> in java.util package
          //3rd Way
         List<String> listl = Arrays.asList("Monday", "Tuesday"); // we can create lidt on the fly here
         System.out.println(listl.getClass().getName()); //java.util.Arrays$ArrayList  -> this is nested static private class not from java.util package -> so we cannot add val in it but replace it
         System.out.println(" ");
         listl.set(1, "Wednesday");
         System.out.println(listl.get(1));
          System.out.println(" ");


           // but if we want to make list3 modifiable ( to add)
        List<String> list4=new ArrayList<>(listl);
        list4.add(1, "Sunday");
        System.out.println(list4);
        System.out.println();

         //4th Way
         String[] array = {"Apple", "Banana", "Cherry"}; 
         List<String> list2 = Arrays.asList(array);
         System.out.println(list2.getClass().getName());//java.util.Arrays$ArrayList
         System.out.println(" ");
       
       
        // 5th Way

        List<Integer> list3=List.of(1,2,3,4); // but this is unmodifiable -> we cannot add or even replace
        System.out.println(list3); 
        System.out.println();

       
      
   
      
      
      // -------Now diff methods to iterate over arraylist , add ele in list , get ele in list , check exixtance , size , etc 

     
     
      //---add
        arrayList.add(2); // 0 index
        arrayList.add(34); //1 index
        arrayList.add(24);
        arrayList.add(3);
        System.out.println(arrayList);
        System.out.println(" ");



        // add all method

        /*
         * 
         * List<Integer> list = new ArraylList<>();

           list.add(1);

           list.add(2);

           list.add(3);


           List<Integer> listl = List.of(4, 5, 6, 7, 8, 9);

           list.addAll(list1);

           System.out.printTi(list); // o/p   1,2,3,4,5,6,7,8,9
         */




        ///----get
        System.out.println(arrayList.get(1));
        System.out.println(" ");
        System.out.println(arrayList.size());
          System.out.println(" ");


        ///----iterate
         for(int i = 0; i < arrayList.size(); i++){
         System.out.println(arrayList.get(i));
         }
           System.out.println(" ");

         for(int x:arrayList){
          System.out.println(x); /// we are not doing .get() here so it print entire array not particular element by index
         }
           System.out.println(" ");


         // ---- exixtance
         System.out.println(arrayList.contains(2));
           System.out.println(" ");
          System.out.println(arrayList. contains (50));
            System.out.println(" ");



          /// -----remove ele
          arrayList.remove( 2);
          System.out.println(arrayList);
            System.out.println(" ");




            // now while removing ele we have two options remove by obj(ele) or by index

            // so to overcome it we have to wrap it

            /*List<Integer> list = new ArraylList<>();
              list.add(1);

              list.add(2);

              list.add(3);
              list.remove(Integer.valueOf(i:1));// wrapping -> so here it removes obj(ele)1 
              System.out.println(list); */





         
          // to add ele bet two indexes

          arrayList.add(2, 45); 
          System.out.println(arrayList);
            System.out.println(" ");
          
            arrayList.add(1, 33);
             System.out.println(arrayList);
            System.out.println(" ");

            arrayList.set(2, 36); // it replaces the 2nd index val with new val
            System.out.println(arrayList); // we not iterate here and print list directly becase it has built in toString() Method


            // converting list into array

            /*
             *List<Integer> list = new ArraylList<>();
              list.add(1);

              list.add(2);

              list.add(3);

              Object[] array = list.toArray(); // obj type array

              Integer] arrayl = list.toArray(new Integer[0]); // int type array









              // we can also sort the array lists

              List<Integer> list = new ArrayList<>();
              list.add(2);

              list.add(1);

              list.add(3);

              Collections.sort(list); 1ST WAY

              list.sort(null); ///2nd way

              System. out.printin(list);






                

                Time Complexity-----


              * Access by index (get) is O(1).
              * Adding an element is O(n) in the worst case when resizing occurs.
              + Removing elements can be O(n) because it may involve shifting elements.
              * Iteration is O(n).  










             */


          }
}




