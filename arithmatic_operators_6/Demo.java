// basic operations

package arithmatic_operators_6;


public class Demo {
    public static void main(String[] args) {
         // add-sub-mul-div-modulus

    int mySalary=100000;
    int bonous=10000;
    int deduction=20000;
    int yearlySalary=mySalary*12;
    int salaryWithBonous=mySalary+bonous;
    int salaryWithoutBonous=mySalary-deduction;
    int remainingSalary=mySalary/4;

    System.out.println(yearlySalary);
    System.out.println(salaryWithBonous);
    System.out.println(salaryWithoutBonous);
    System.out.println(remainingSalary);

    int a=5;
    int b=2;
    int c=a%b;
    System.out.println(c);




    // now these operations in detail 

    //1.addition 
       // addition of mixed data types
       int d=5464;
       double e=645.64564;
       double f=d+e;
       System.out.println(f);

        float g=465.645f;
        long h=4654656;
        float i=g+h;
        System.out.println(i);

        int j=654654464;
        int k=1332;
        System.out.println(j*k);//actual ans - 8,71,99,97,46,048 , we got - 12,13,84,960 // it exceeds int range so conver it into long

        long l=654654464;
        int m=1332;
        System.out.println(l*m);// now we got corrected output // here we multiplying long with int 
   
    //2.division

        // int n=10;
        // int o=3;
        // int p=n/o;//3 due to int
        // System.out.println(p);
        
        int n=10;
        double o=3;
        double p=n/o;//3 due to int
        System.out.println(p);
        
        // float q=56.464f;   // less precision  in ans
        // int r=34;            //widening
        // float s =q/r;
        // System.out.println(s);

        double q=56.464f;   // more precision in ans
        int r=34;   
        double s =q/r;
        System.out.println(s);
   
   
        // if we are trying to divide by zer then it is arithmatic excaeption in programming languages


        int t=10;
        int u= t-10;
        int v=t/u; // also %  // diviser can't be zero
        System.out.println(v);
       // Exception in thread "main" java.lang.ArithmeticException: / by zero
        //at arithmatic_operators_6.Demo.main(Demo.java:79)
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    }
    
    


}
