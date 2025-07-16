package Arrays_12;

public class Demo {
    public static void main(String[] args) {

        // 1-D array 

        // array is collection of similar type of data
        // syntax - datatype[] variablename;
        int[] arr=new int[10];
        // or  int arr[]=new int[10];
        // array is stord in heap memeory and that arr reference  variable stores the address in stack memory

        // traversing of array
        for(int i=0;i<=arr.length;i++){
            System.out.println(i); // (0 - 10)
            
            
        }
        System.out.println();
        System.out.println();
        // here length is property not method


        // also another type of array declaration
        int[] arr1={1,2,3,4};
        for ( int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
           
        }
        System.out.println();
        System.out.println();

        // using for-each loop
        for( int i:arr1){
            System.out.println(i);
            
        }
        System.err.println();
        System.out.println();

        // finding maximum element in an array

        int[] arr2=new int[5];
        arr2[0]=2;
        arr2[1]=-756;
        arr2[2]=76;
        arr2[3]=-62;
        arr2[4]=26;
        int res=Integer.MIN_VALUE;  // -infinity 

        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>res){
                res=arr2[i];
            }
        }
        System.out.println(res);
        System.out.println();



        // array in reverse order

        //for(int i=arr.length-1;i>=0;i--){sys(arr[i])}

        //sum m of array-> sum=0; for(int i=0;i<arr.length;i++){ sum=sum+a[i]; }




        // 2-D Array

        // int[][]=new int[][]; // 3*3 matrix 
        //int [][] arr3=new int[3][3];
        // or 
        int [][] nums={ {1,2,3},
                         {4,5,6},
                        {7,8,9}};

        System.out.println(nums[1][2]);//6
        System.out.println();

        // traversing

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++)
            {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }


        // array of diff length arrray - jagged array -so arr[i].length is best practice
        // ab
        // cde
        // fg

        // imperative - line by line
        // functional -  we can treat function at variables





    }
}
