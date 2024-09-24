//Binary Subarray with sum

import java.util.*;

public class slidingwindow12 {
    public static void main(String[] args) {
        int arr[]={1,0,1,0,1};
        int goal=2;
        int sum=0;
        int noofsubarray=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==goal){
                    noofsubarray++;
                }
            }
        }
        System.out.println(noofsubarray);
    }
}
