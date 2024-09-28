//second largest element of an arr without sorting

import java.util.*;

public class secondlargestelementofanarrwithoutsort {
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5,6,4,3,9};
        int large=arr[0];
        int secondlarge=arr[0];
        for(int i=0;i<arr.length;i++){

           if(large<arr[i]){
                
                secondlarge=large;
                large=arr[i];
           }

        }
        System.out.println(large);
        System.out.println(secondlarge);
    }
}
