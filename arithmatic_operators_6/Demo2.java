// increment -decrement operators - pre-post increment-decrement // bitwise operators
package arithmatic_operators_6;

public class Demo2 {
    public static void main(String[] args) {
        // int a=99;
        // a++;
        // System.out.println(a);//100

        // int a=99;
        // a--;
        // System.out.println(a);//98

        int a=99;
        int result= a++ + --a;
        System.out.println(result);  // a++ = 99 (but use 100 for next cal) -> --a = 100-1 = 99 -> 99+99=198
    


        // bit wise operators

        // if we want to deal with binaries means 0's and 1's then we use bitwise operators
        
        // operands - byte,short ,int ,long (not on decimals)

        // operators are = and(&),or(|),xor(^),not(~),left shift(<<),right shift(>>),unsigned right shift(>>>)

        // & operator means normal bianry addition of two numbers - then result in decimal
        //&
        // int b=5;
        // int c=2;
        // int results=b&c;
        // System.out.println(results);//0 

        //|
        // int b=5;
        // int c=2;
        //     int results=b|c;
        // System.out.println(results);//7  

        //^
        // int b=5;
        // int c=2;
        //     int results=b^c;
        // System.out.println(results);//7 


        //~
        int b=5;
        int results=~b;
        System.out.println(results);//-6 (11111........010)
        System.out.println(Integer.toBinaryString(-6));

        // <<

        // int c=5;
        // int d=c << 1;
        // System.out.println(d);// 1010 -> 10
 
        int c=5;
        int d=c >> 1;
        System.out.println(d);//10 -> 2

        int e=10;
        int f=e >> 2;
        System.out.println(f);

        //unsigned right shift  ( filled left remaining space with 0's)
        int g= 7;;
        int h=g >>> 2;
        System.out.println(h);


    }
}
