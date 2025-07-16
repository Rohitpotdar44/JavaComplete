package Methods_14;

public class Demo {
        public static void main(String[] args) {
            //sysntax
            // accessModifier returnType  mehthodName (parameters){ body} 

            // e.g 

            String str=updatedString("    rohit     ");
            System.out.println(str);
            System.out.println();


            int result=addFun(1,2,3);
            System.out.println(result);
            System.out.println();

            boolean prime=isPrime(97);
            System.out.println(prime);





}
 
// declare methods outside the main method and use inside the main method
 private static String updatedString(String str){
   return str.trim().toUpperCase();
   
 }



 // method overloading - method name,return type same but parameters different (also data type maybe different)
 // method signature means method name and parameters only


 // varibles arguments( ... ) - used to add parameters after declaring the method

 private static int addFun(int...a ){
        int sum=0;
        for( int i:a){
            sum+=i;
        }
        return sum;

 }


 
        // prime or not

        private  static boolean isPrime(int x){
            int res=0;
            for( int i=1;i< x/2;i++){
               if(x%i==0){
                   res++;
               }
            }
            return res==1;
       }


}
