package loops_10;
// for - while - do-while loops
public class Demo {
    public static void main(String[] args) {
        
        // 1. while loop 

        //syntax -> 

        // initilization
        //while(condition){updation }  it runs until the condition is true
        // 
         int a=1;
         while (a<=10) {
            System.out.println("Hiii");
            a++;
            
         }
         // after using while loop we can't reuse that variable , but in for this is not the case





         // 2. do-while loop
         // do{executes one time}while(condition);

         int j=1;
         do{
            System.out.println(j);
            System.out.println();
            j++;
         }while(j<=20);


         // for loop
         // for( initilization;condition;update){ code }

         for(int m=1,n=1;n<=6;m=m*10,n++){
            System.out.println(m);
            System.out.println();
         }


         // table of 7

        //  for( int o=7,p=1;p<=10;o=o+7,p++){
        //     System.out.println(o);
        //     System.out.println();
        //  }
        
        for( int o=1;o<=10;o++){
            System.out.println("7*"+o + "="+ o*7);
            System.out.println();
         }


        // sum of 10 natural numbers

         int sum=0;
         int p=1;
          while(p<=10){
            sum=sum+p;
            p++;
           
          }
          System.out.println(sum);


         // count no of digits

         int q=64556213;
         int res=0;
           while(q>0){
                q=q/10;
                res++;
           }
           System.out.println(res);


           // factorial 

           int t=5;
           int result=1;
           while(t>0){
            result=result*t;
            t--;
           }
           System.out.println(result);

           int fact=1;
           for(int u=6;u>0;u--){
                fact=fact*u;
                
           }
           System.out.println(fact);
           System.out.println();




           // break and continue

           int v=1;
           while(v<=10){
            System.out.println(v);
            
             if(v==5){
               
               break;
             }
            v++;
           }

           int w=1;
           while(w<=10){
           
            if(w==5){
               w++;
               continue;
            }
            System.out.println(w);
            w++;
           }
           

           


    }
}
