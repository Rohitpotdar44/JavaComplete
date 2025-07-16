package Math_methods_29;

public class Demo {
    public static void main(String[] args) {
        int a=24;
        int b=45;
        float c=64f;
        double d=343.4343;
        double e=3.5;


        System.out.println(Math.min(a, b));
        System.out.println(Math.abs(-89));
        System.out.println(Math.sqrt(c));
        System.out.println(Math.pow(a, b));
        System.out.println(Math.ceil(d));
        System.out.println(Math.floor(d));
        System.out.println(Math.round(3));
        System.out.println(Math.random()*11);// prints random mumber between 1 to 10
         //Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0

         System.out.println(Math.nextAfter(1, 2));


        // Outputs->


         // 24
// 89
// 8.0
// 1.2867846661244436E62
// 344.0
// 343.0
// 3
// 9.81171852331806
// 1.0000001
    }
}
