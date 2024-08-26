// You are given a read only array of n integers from 1 to n.

// Each integer appears exactly once except A which appears twice and B which is missing.

// Return A and B.

// Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

// Note that in your output A should precede B.

// Example:

// Input:[3 1 2 5 3] 

// Output:[3, 4] 

// A = 3, B = 4

public class repeatmissing {
    public static void main(String[]args){
        int nums[]={3,1,2,5,4,6,10,9,7,7,8,12};
        int repeat=0;
        int missing=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int i=0;i<nums.length-1;i++){
           if(nums[i]==nums[i+1]){
            repeat=nums[i];
           }
            if (nums[i+1]!=nums[i]+1){
            missing=nums[i]+1;
           }
           
        }
        System.out.println(missing);
        System.out.println(repeat);
        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }
    }
}
