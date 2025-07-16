
package Arrays_12;

class Que {

    int arr[] = {1, 3, 5, 6};
    int target = 9;
    public int[] findTwoSum(){  
        for(int i=0; i< arr.length;i++)
        {
            for(int j=i+1 ;j< arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    return new int[] {arr[i] , arr[j]};
                }
            }
        }
                return null;
    }



    
    

        public static void main(String[] args) 
        {
        Que que = new Que();
        int[] result= que.findTwoSum();
           
        if(result !=null)
            {
               System.out.println("Numbers found :"+ result[0] + " "+ "&"+ " " + result[1]);
            }
             else{
            System.out.println("Not found");
        }


    }
}