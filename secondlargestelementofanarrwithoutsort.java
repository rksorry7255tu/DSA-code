//second largest element of an arr without sorting

import java.util.*;

public class secondlargestelementofanarrwithoutsort {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
        int large=arr[0];
        int secondlarge=arr[0];
        for(int i=0;i<arr.length;i++){
            large=Math.max(large,arr[i]);
            if(arr[i]>secondlarge&&arr[i]<large){
                secondlarge=arr[i];
            }
        }
       
        System.out.println(large);
        System.out.println(secondlarge);
    }
}
