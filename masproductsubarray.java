// Given an integer array nums, find a 
// subarray
//  that has the largest product, and return the product.

// The test cases are generated so that the answer will fit in a 32-bit integer.

 

// Example 1:

// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.
// Example 2:

// Input: nums = [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 
public class masproductsubarray {
    public static void main(String[]args){
        //int nums[]={-2,0,-1};
        int nums[]={2,3,-2,4};
        int product=1;
        int subarray[]=new int[nums.length*nums.length];
        
           
            for(int j=0;j<nums.length;j++){
               product=nums[j]*product;
               subarray[j]=product;
            }
        int large=subarray[0];
        for(int i=0;i<nums.length;i++){
            //System.out.println(subarray[i]+" ");
            if(subarray[i]>large){
                large=subarray[i];
            }
        }
        System.out.println(large);

    }
}
