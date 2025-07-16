package Generics_33.GenericType_2.GenericConstructor_5;
// it is not needed that for the Generic Constructor class must be Generic 
public class Test {
        /// here we created generic constructor rather than generic class
        public<T> Test(T Price){
 System.out.println(Price);
        }
        public static void main(String[] args) {
            Test test=new Test(3000);
           
        }
}
