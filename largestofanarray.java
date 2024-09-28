// find the largest element in an an array

import java.util.*;
public class largestofanarray {
    public static void main(String[] args) {
        int arr[]={1,4,2,6,3,7,5,3};
        int large=arr[0];
        for(int i=0;i<arr.length;i++){
            large=Math.max(large,arr[i]);
        }
        System.out.println(large);
        Arrays.sort(arr);
        int large1=arr[arr.length-1];
        System.out.println(large1);
    }
}
