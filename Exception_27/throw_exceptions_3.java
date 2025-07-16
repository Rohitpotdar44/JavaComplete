package Exception_27;
// there are the checked exceptions by the compiler
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class throw_exceptions_3 {
    public static void main(String[] args) throws FileNotFoundException {
        method2();
    }

    public static void method2() throws FileNotFoundException{
        method1();
    }

    public static void method1() throws FileNotFoundException{
        try {
            FileReader fileReader=new FileReader("acd.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new FileNotFoundException("opps");
        }
    }

    // output 
//     File not found
// Exception in thread "main" java.io.FileNotFoundException: opps
//         at Exception_27.throw_exceptions.method1(throw_exceptions.java:20)
//         at Exception_27.throw_exceptions.method2(throw_exceptions.java:12)
//         at Exception_27.throw_exceptions.main(throw_exceptions.java:8)




}
