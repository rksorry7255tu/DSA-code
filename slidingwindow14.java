//count the no of nice subarray

import java.util.*;
public class slidingwindow14 {
    public static void main(String[] args) {
        int arr[]={1,1,2,1,1};
        int k=3;
        int maxcount=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
           
            for(int j=i;j<arr.length;j++){

                if(arr[j]%2!=0){
                    count++;
                }
                if(count==k){
                    maxcount++;  
                } 
            }
            count=0;
        }
        System.out.println(maxcount);
       
    }
}
