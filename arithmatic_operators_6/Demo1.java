//operator_presedence and compound assignment operator 

package arithmatic_operators_6;

public class Demo1 {
    public static void main(String[] args) {
        // persedence means order of executing operators means * then / then + then - if () then take it first

        // int result= 5+3*2;
        // System.out.println(result); //11

        int result= (5+3)*2;
        System.out.println(result);//16


        // if division and multiplication comes together then starts from left side
        int a=40,b=20;
        int results=a/b+3*2-1;  // 2+6-1 = 8-1=7
        System.out.println(results);


        // compound assignment operator 

        // int b=10;
        // b=b+1;
        // instead write b +=1;


        int c=10;
        c+=2;   // same for * / + - %
        System.out.println(c);

        byte d=10;
        // d=(byte)(d+10);
        // need to tycaste to byte from int
         
        d+=10;
        // here we don't get any error because compound assignment operator does it implicitly(auto)
        System.out.println(d);

    }
}
