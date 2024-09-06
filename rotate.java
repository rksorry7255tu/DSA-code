// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
import java.util.*;
public class rotate {
    public static void main(String[] args) {
        int []  nums = {1,2,3,4,5,6,7};
        int [] res=new int[nums.length];
        ArrayList<Integer> list=new ArrayList<>();
        int k=3;
        int i=0;
         for(int j=nums.length-k;j<nums.length;j++){
           res[i]=nums[j];
            i++;
         }
        for(int j=0;j<nums.length-k;j++){
            res[i]=nums[j];
            i++;   
        }
        for(int j=0;j<nums.length;j++){
            list.add(res[j]);
        }
        System.out.println(list);
    }
}
