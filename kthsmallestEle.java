// Given an array arr[] and an integer k where k is smaller than the size of the array, the task is to find the kth smallest element in the given array. It is given that all array elements are distinct.

// Follow up: Don't solve it using the inbuilt sort function.

// Examples :

// Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
// Output:  7
// Explanation: 3rd smallest element in the given array is 7.
import java.util.*;

public class kthsmallestEle {
    public static void main(String []args){
        int arr[]={2, 3, 1, 20, 15};
        int k=4;
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
