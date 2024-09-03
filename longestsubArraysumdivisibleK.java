// Given an arr[] containing n integers and a positive integer k. The problem is to find the longest subarray’s length with the sum of the elements divisible by the given value k.

// Examples:

// Input: arr[] = {2, 7, 6, 1, 4, 5}, k = 3
// Output: 4
// Explanation: The subarray is {7, 6, 1, 4} with sum 18, which is divisible by 3.

// Input: arr[] = {-2, 2, -5, 12, -11, -1, 7}, k = 3
// Output: 5


public class longestsubArraysumdivisibleK {
    public static void main(String[]args){
        int arr[]={-2, 2, -5, 12, -11, -1, 7};
       // int  arr[] = {2, 7, 6, 1, 4, 5};
        int k = 3;
        int size=0;

        for(int i=0;i<arr.length/2;i++){
            int max=0;
            int size1=0;
            //int size1=0;
            for(int j=i;j<arr.length;j++){
                max=max+arr[j];
                if(max%k==0 ) {
                    size1=j-i+1;
                    if(size<size1){
                        size=size1;
                        
                    }
                    
                }
            }
        }
         System.out.println(size);
    }
}
