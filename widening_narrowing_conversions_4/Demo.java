package widening_narrowing_conversions_4;

public class Demo {
    public static void main(String[] args) {
        int a=10;  // 4 bytes
    float b=a; //4 bytes
    long c=a; // 8 bytes
    // here we can't get any type of error because long is a big container so we can use smaller vaues such as int and float in long , but this is not a case vise-versa - small to big os ok but big to small is not ok
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);


    float d=1.554f; /// we have to do float to int so need to type cast
    int e=(int)d;// here type mismatch so we have to do type casting
    System.out.println(e);

// widening

    byte bytevalue=10;//1byte
   short shortvalue=bytevalue;//2bytes //byte to short   // char also 2 bytes
   int intvalue=shortvalue;//4bytes
   long longvalue=intvalue;//8bytes // widening conversion from int to long
   float floatvalue=longvalue;//4bytes
   double doublevalue=floatvalue;//8bytes
   
    System.out.println("byte_value"+bytevalue);
    System.out.println("short_value"+shortvalue);
        // widning -implicit-automatic

     // char-int & char-float
     char charvariable='A';
     int intvariable=charvariable;
     System.out.println("int "+intvariable);
     System.out.println("char "+charvariable);
      // same for float 


        // narrowing conversion 
        

        double doublevariable=11.254654;
        float floatvariable=(float)doublevariable;//narrowing from double to float
        System.out.println("double"+doublevariable);
        System.out.println("float"+floatvariable);


        //printing max value of long
        long g = Long.MAX_VALUE;//no need to remember 
        System.out.println(g);
        //long to int
        int intvar=(int)g;
        System.out.println(intvar);

        // method to find binary

        System.out.println(Integer.toBinaryString(10));
        System.out.println(Long.toBinaryString(Long.MAX_VALUE));
        System.out.println(Integer.toBinaryString(-1));
        System.out.println();
        System.out.println(doublevalue);// only to remove warning







    }
    
   

   



}
