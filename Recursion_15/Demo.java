package Recursion_15;

public class Demo {
    public static void main(String[] args) {
        // to find factorial

        int results = numberFactorial(5);
        System.out.println(results);
        System.out.println();

        int result = additionOf(23);
        System.out.println("Sum of numbers from 1 to 4: " + result);
        

    }


// 5 fact = 5 * 4 fact

        // call stack - tracks the method's calling
    private static int numberFactorial(int x){
        if(x==1){
            return 1;
        }
        return x * numberFactorial(x-1);
        


        


    }

// sum of n natural numbers
private static int additionOf(int n){
    if (n == 1) {
        return 1; // Base case
    }
    return n + additionOf(n - 1); // Recursive case
}

 


}
