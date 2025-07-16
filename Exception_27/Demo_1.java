package Exception_27;
// there are 3 types of errors in java 

// 1.Syntax error - any error in code made by programmer  
// 2.Logical error- code will run but it is logically wrong e.g in div method we write mul logic
// 3.Runtime error - program will crash in run time error , statement after that affected one not executed e.g 3/0-> here runtime error shows arithmatic exception

//Excaption handling is the way to handle errors so normal flow of the allpication is maintained


public class Demo_1 {
    
    public static void main(String[] args) {
        int[] numerators={30,56,65,78};
        int[] denominators={5,2,0,2};

              for(int i=0;i<10;i++)
            {
               try {
                    System.out.println(divide(numerators[i],denominators[i]));
               } catch (Exception e) {
                    System.out.println(e);
               }
                 
            }
            System.out.println("Good job! :)");
          
            try {
               level1();
            } catch (Exception e) {
              e.printStackTrace();
            }
          
    }
        public static int divide(int a, int b)
        { 
           try {
            return a/b;
           } catch (Exception e)// here e is the object which is thrown at runtime 
           {
                System.out.println(e);
                return -1;
           } 
        
         }

         // 1] unchecked exceptions -> following exceptions are not checked by the compiler , they are checked in run time



// we are getting java.lang.ArithmeticException: / by zero this n output because of the toString() method of the Exception class
// exception->throwable -> public String toString() {
                 //     String s = getClass().getName();
                 //     String message = getLocalizedMessage();
                 //     return (message != null) ? (s + ": " + message) : s;
                 // }
// if we simply print normal object direct then we got output in some hash code because of the toString() method of the sysout
// if we have to print our own msg there then we can write there





// HIERARCHY =


// java.lang.Object
//   |
//   └── java.lang.Throwable
//        ├── java.lang.Error
//        │    ├── java.lang.VirtualMachineError
//        │    │    ├── java.lang.OutOfMemoryError
//        │    │    └── java.lang.StackOverflowError
//        │    ├── java.lang.LinkageError
//        │    │    ├── java.lang.ClassFormatError
//        │    │    └── java.lang.NoClassDefFoundError
//        └── java.lang.Exception
//             ├── java.lang.RuntimeException
//             │    ├── java.lang.ArithmeticException
//             │    ├── java.lang.NullPointerException
//             │    ├── java.lang.IndexOutOfBoundsException
//             │    └── java.lang.IllegalArgumentException
//             ├── java.io.IOException
//             │    ├── java.io.FileNotFoundException
//             │    └── java.io.EOFException
//             ├── java.sql.SQLException
//             ├── java.lang.reflect.InvocationTargetException
//             ├── java.net.SocketException
//             └── java.net.UnknownHostException



// we can write multiple catch block but write accoding to hierarchy such as if Exception e written first then write Arithmatic exception and all then it makes no sense




// Stack Trace

public static void level3(){
     int[] array= new int[5];
     array[5]=10;

}
public static void level2(){
     level3();
}
public static void level1(){
     level2();
}




     // 2] checked exceptioms- these exceptions are checked by the compiler 

               // ****throws keyword->
     
     
     // normally we use try-catch aor even multiple try-catch blocks or we inform it's caller that there is an exception in it 

     // now using throws keyword we write throws keyword in front of that respected method

     // see throws_keyword.java


               // throw kwyword to throw our custom exceptions

}

// 1) output =
        // 6
        // 28
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        //         at Exception_27.Demo.divide(Demo.java:24)
        //         at Exception_27.Demo.main(Demo.java:19)


// 2) output = 

                // 6
                // 28
                // java.lang.ArithmeticException: / by zero
                // -1
                // 39
                // Good job! :)



// 3)Output=



// 6
// 28
// java.lang.ArithmeticException: / by zero
// -1
// 39
// java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
// java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
// java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4
// java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 4
// java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 4
// java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 4
// Good job! :)




// 4) output=

// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//         at Exception_27.Demo.level3(Demo.java:96)
//         at Exception_27.Demo.level2(Demo.java:100)
//         at Exception_27.Demo.level1(Demo.java:103)
//         at Exception_27.Demo.main(Demo.java:29)


// out of these 
//           at Exception_27.Demo.level3(Demo.java:96)
//         at Exception_27.Demo.level2(Demo.java:100)
//         at Exception_27.Demo.level1(Demo.java:103)
//         at Exception_27.Demo.main(Demo.java:29)    is the stack trace which is the proper flow of the method or program execution
// we can also print it by using printStackTrace() method








// 5)output =

// 6
// 28
// java.lang.ArithmeticException: / by zero
// -1
// 39
// java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
// java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
// java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4
// java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 4
// java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 4
// java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 4
// Good job! :)
// java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//         at Exception_27.Demo.level3(Demo.java:100)
//         at Exception_27.Demo.level2(Demo.java:104)
//         at Exception_27.Demo.level1(Demo.java:107)
//         at Exception_27.Demo.main(Demo.java:29)