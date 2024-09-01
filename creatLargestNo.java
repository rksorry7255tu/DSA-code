// Given an array of strings arr[] of length n, where every string representing a non-negative integers, the task is to arrange them in a manner such that after concatenating them in order, it results in the largest possible number. Since the result may be very large, return it as a string.

// Examples:

// Input: n = 5, arr[] = {“3”, “30”, “34”, “5”, “9”}
// Output: “9534330”
// Explanation: Given numbers are {“3”, “30”, “34”, “5”, “9”}, the arrangement “9534330” gives the largest value.

// Input: n = 4, arr[] = {“54”, “546”, “548”, “60”}
// Output: “6054854654”
// Explanation: Given numbers are {“54”, “546”, “548”, “60”}, the arrangement “6054854654” gives the largest value.

import java.util.*;

public class creatLargestNo {
    public static void main(String[]args){
        String[] arr1 = {"3","30","34","5","9"};


         Comparator<String> myCompare= (X,Y) -> (Y+X).compareTo(X+Y);
        
          Arrays.sort(arr1, myCompare);

          String result=arr1[0];
        for(int i=1;i<arr1.length;i++){
            result=result+arr1[i];
           
        }
        System.out.println(result);
       
    
    }
    
}
