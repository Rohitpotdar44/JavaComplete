package wrapper_classes_28;
// to convert primitive integer into object
// it converts primitive variables of the primitive datat types into the reference variables(objects) of the Class -> to access the object related methods
public class Demo {
    public static void main(String[] args) {
        int a=10;
        // hrea a is the primitive variable of the primitive data type int -> that is stored in stack

        Integer b=11;
        // here b is the reference variable of the Integer class -> which is stored in heap
        // here  The Integer class wraps a value of the primitive type int in an object.
        b.hashCode();
        // so we can now access methods easily




        // We can also write like this  Integer c=Integer.valueOf(12); but there is no need we need Integer c=12; only that auto conversion made by java is called as auto boxing

        int c=b;
        // int c=b.intValue(); this is called as auto unboxing


        // we can do all normal computations like primitive data types but he difference is wrapper class holds the null value

        Integer e=null;



        // we have multiple methods there such as

        System.out.println(Integer.max(12, 21));
        System.out.println(Integer.toBinaryString(15));
        String str="123";
        Integer i=Integer.valueOf(str);
        System.out.println(i);

        // 21
        // 1111
        // 123


        int f=34;// 1) f has some reference 3) but still f pointings to 34 
        fun(f);
                System.out.println(f); // so o/p 34
        
        
        
        
        
        
            }
            public static void fun(Integer a) {// 1) now a has also same reference 
        a=2;// 2) now a has another reference 
    }
}
