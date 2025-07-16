package Patterns_11;

public class Demo {
    public static void main(String[] args)
     {
        for (int i = 1; i <= 5; i++) 
        {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) 
        {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        
        for (int i = 1; i <= 4; i++) 
        {

            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
            
           
        }

        System.out.println();
        System.out.println();

      
        for (int i = 1; i <= 4; i++) 
        {

            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
            
        }
        

        System.out.println();
        System.out.println();

        int count=1;
        for (int i = 1; i <= 4; i++) 
        {

            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++,count++) {
                System.out.print(count + " ");
            }
            System.out.println();
            
        }

        System.out.println();
        System.out.println();

        for(int l=1;l<=5;l++){
            for( int m=4;m>=l;m--){
                System.out.print(" ");
            }
            for(int n=1;n<=l;n++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
        for(int o=1;o<=4;o++){
            for(int p=1;p<=o;p++){
                System.out.print(" ");
            }
            for(int q=4;q>=o;q-- ){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        for (char i = 'A'; i <= 'E'; i++) 
        {
            for (char j = 'D'; j >= i; j--) {
                System.out.print(" ");
            }
            for (char k ='A' ; k <= i; k++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for (char i ='A' ; i <= 'D'; i++) 
        {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(" ");
            }
            for (char k = 'D'; k >= i; k--) {
                System.out.print(i +" ");
            }
            System.out.println();
        }



    }
}
