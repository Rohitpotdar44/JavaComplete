package conditional_ststements_9;
// conditional statements by studying relational operators and logical operators
public class Demo {
    public static void main(String[] args) {

        
        //  relational -> compare two values and returns boolean result ( = , != , == , ! == , <= ,>=)

       // e.g
        int a=1;
        int b=2;
        boolean c= a==b;
        System.out.println(c);




        // logical operators = 1. && -> logical and               bit wise is single and 
                            //    2. || -> logical or 
                            //    3. ! -> logical not
        // logical operators are used to combine more than one booleans

        //e.g

        int age=45;
        String name="Ajay";
        boolean result=(age==45)&&(name=="Ajay");
        System.out.println(result);  

        boolean d= 2>=1;
        boolean e= 1>4;
        System.out.println(d || e);


        // conditional ststements

       // 1. if 2. if-else 3. if-else ladder
       // if(true{}) -> this always runs

        // 4. Switch case

        String fruit="Apple";
        switch (fruit) {
            case "Banana":{
                System.out.println("This is banana");
                break;
            }
            case "Mango":{
                System.out.println("This is mango");
                break;
            }

            case "Apple":{
                    System.out.println("This is Apple");
                    break;
                }


            case "Pinapple":{
                    System.out.println("This is Pinapple");
                    break;
                }
            
            default:{
System.out.println("Invaid case");
            }
                
        }

// it directly jumps to case apple so save time
// switch does not  double and float - we use if-else there  (because they hava precision )
















 















    }
}
