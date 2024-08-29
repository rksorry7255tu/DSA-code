// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.
// Example 2:

// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Theresum {
    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -4, -1 };
        // int nums[]={0,0,0};
        List<List<Integer>> li = new ArrayList<>();
        HashSet<List<Integer>> HS = new HashSet<>();

        // so from the below sorting technique we can use any of them either manual or
        // predefined
        Arrays.sort(nums);

        // int temp1;
        // for(int i=0;i<nums.length;i++){
        // for(int j=i+1;j<nums.length;j++){
        // if(nums[i]>nums[j]){
        // temp1=nums[i];
        // nums[i]=nums[j];
        // nums[j]=temp1;
        // }
        // }
        // }

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length - 2; j++) {
        //         for (int k = j + 1; k < nums.length; k++) {

        //             if (nums[i] + nums[j] + nums[k] == 0) {

        //                 // System.out.println(nums[i] + " " + nums[j] + " " + nums[k] + " ");
        //                 List<Integer> temp = new ArrayList<>();
        //                 temp.add(nums[i]);
        //                 temp.add(nums[j]);
        //                 temp.add(nums[k]);
        //                 HS.add(temp);

        //             }
        //         }
        //     }
        // }
        // for (List<Integer> t : HS) {
        //     li.add(t);
        // }




        for (int i = 0; i < nums.length; i++) {
        int j,k;
        j=i+1;
        k=nums.length-1;
        while(j<k){
        if (nums[i] + nums[j] + nums[k] == 0) {

        //System.out.println(nums[i] + " " + nums[j] + " " + nums[k] + " ");
        List <Integer> temp=new ArrayList<>();
        temp.add(nums[i]);
        temp.add(nums[j]);
        temp.add(nums[k]);
        HS.add(temp);
        k--;

        }
        else if(nums[i] + nums[j] + nums[k] > 0) {
        k--;
        }
        else{
        j++;
        }
        }
      
        }
        for(List<Integer> t:HS){
        li.add(t);
        }

        System.out.println(li);
    }
}
