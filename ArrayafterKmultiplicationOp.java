// You are given an integer array nums, an integer k, and an integer multiplier.

// You need to perform k operations on nums. In each operation:

// Find the minimum value x in nums. If there are multiple occurrences of the minimum value, select the one that appears first.
// Replace the selected minimum value x with x * multiplier.
// Return an integer array denoting the final state of nums after performing all k operations.

// Example 1:

// Input: nums = [2,1,3,5,6], k = 5, multiplier = 2

// Output: [8,4,6,5,6]

public class ArrayafterKmultiplicationOp {
    public static void main(String[] args) {
        // int nums[] = { 2, 1, 3, 5, 6 };
        int nums[] ={1,2};
        int k = 3;
        int multiplier = 4;

        for (int j = 0; j < k; j++) {
            int small=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<nums[small]){
                    small=i;
                }
            }
            nums[small]=nums[small]*multiplier;
           
            if(j==k-1){
                for(int i=0;i<nums.length;i++){
                    System.out.print(nums[i]+" ");
                }
            }
            System.out.println();


        }
    }
}
