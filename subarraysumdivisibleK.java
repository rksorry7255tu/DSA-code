// Given an arr[] containing n integers and a positive integer k. The problem is to find the longest subarray’s length with the sum of the elements divisible by the given value k.

// Examples:

// Input: arr[] = {2, 7, 6, 1, 4, 5}, k = 3
// Output: 4
// Explanation: The subarray is {7, 6, 1, 4} with sum 18, which is divisible by 3.

// Input: arr[] = {-2, 2, -5, 12, -11, -1, 7}, k = 3
// Output: 5


public class subarraysumdivisibleK {
    public static void main(String[] args) {
        // The array elements
        int arr[] = {-2, 2, -5, 12, -11, -1, 7};
        //int k1=3;
        int sum=0;
        int index=0;
        int largeindex=0;
       
        //subarray
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                    index=index+1;
                    //System.out.print(arr[k]+" ");
                }
               
                //System.out.print("="+sum);
                if(sum%3==0){
                    
                   
                   
                    //System.out.print("="+sum);
                    if(index>largeindex){
                        //System.out.println("=="+index);
                        largeindex=index;
                    }
                    //System.out.println("=="+index);
                }
                //System.out.println();
                sum=0;
                index=0;
            }
        }
        System.out.println(largeindex);
    }
}
