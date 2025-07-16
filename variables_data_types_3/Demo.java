// primitive data types - integer,decimal,character,boolean
package variables_data_types_3;

public class Demo {
    public static void main(String[] args) {
         /*  for integral numbers - byte , 
                                   short , 
                                   int , 
                                   long 
                e.g */
                    byte age1=-128;
                    short age3=32767; 
                    int age=2147483647;  
                    long age2=9223372036l; //by default java consider every non decimal number as integer - so write l             
                     
                   // range(CAPACITY) - byte<short<int<long 
                    //No need to learn this capacities instead use 
                    System.out.println(Byte.MAX_VALUE); //B is capital(wrapper class)
                    System.out.println(Byte.MIN_VALUE);
                    System.out.println("");

                    System.out.println(Short.MAX_VALUE);//S capital
                    System.out.println(Short.MIN_VALUE);
                    System.out.println("");

                    System.out.println(Integer.MAX_VALUE); //Integer
                    System.out.println(Integer.MIN_VALUE);
                    System.out.println("");

                    System.out.println(Long.MAX_VALUE);//L capital
                    System.out.println(Long.MIN_VALUE);
                    System.out.println("");

                    System.out.println(age);
                    System.out.println(age1);
                    System.out.println(age2);
                    System.out.println(age3);
                    System.out.println("");
                    


                                
        /* for decimal numbers - double ,
                                 float  */

            float mySalary=1654.5443546f;//by default java considers every decimal number as double so write (f)after float number 
            // float capacity after decimal is 7 precitions e.g 1.1546543 - 100.46546 like wise 
            double yourSalary=1654.5443546;
            // double has upto 15 after decimal
            System.out.println(mySalary);
            System.out.println(yourSalary);
            System.out.println("");

            float m_salary=4454564546454645.54464454654f;
            // before decimal it round of and write in terms of scientific notaion such as e - (means 10 to the power of)
            double y_salary=4454564546454645.54464454654f;
           System.out.println(m_salary);
           System.out.println(y_salary);
           System.out.println("");

            float float_min= Float.MIN_VALUE;
            float float_max= Float.MAX_VALUE;
            System.out.println("Float min value is"+float_min);
            System.out.println("Float max value is"+float_max);
            System.out.println("");

            double double_min= Double.MIN_VALUE;
            double double_max= Double.MAX_VALUE;
            System.out.println("Double min value is"+double_min);
            System.out.println("Double max value is"+double_max);
            System.out.println("");
      
            float myy_salary=44545645464546645555465446546546654654.54464454654f;//thisis max capacity is add single no in before decimal it shows error
            double yo_salary=445456454645464554654654654.54464454654f;
           System.out.println(myy_salary);
           System.out.println(yo_salary);
           System.out.println("");







        //characters

        // store single character number or symbol written in single quotes
        char initial='a';
        System.out.println(initial);
        System.out.println("");

        char initials='A';//also for small characters
        System.out.println((int)initials);//typecasting
        System.out.println("");

        char initialss='Z';
        System.out.println((int)initialss);//typecasting
        System.out.println("");

        System.out.println(Character.MIN_VALUE);//not recognising
        System.out.println(Character.MAX_VALUE);
        System.out.println("");

        // so type casting 
        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);
        System.out.println("");
        // so we can store 0-65535 characters in java
        
        System.out.println((char)10084);
        System.out.println("");

        char hindichar=2309;
        System.out.println(hindichar);
        System.out.println((char)9689);
        System.out.println("");
        System.out.println((char)9699);
        System.out.println("");
        
        for(int i=0;i<=127;i++){
            System.out.println((char)i); 
        }
        System.out.println("");

// ascii values A-Z = 65-90 a-z =97-122

       System.out.println((char)35); // for #
       System.out.println("");



        //booleans

        boolean isEligible = false;
        System.out.println(isEligible);
        System.out.println("");
        // here false is a reserved keyword


    }
}       