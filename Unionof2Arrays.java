//union of 2 arrays
// int arr1[]={7,3,9};
// int arr2[]={6,3,9,2,9,4};
// union={7,3,9,6,2,4}
//out-6

import java.util.*;
import java.io.*; 


public class Unionof2Arrays {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer> set=new HashSet<>();

        for(int x:arr1){
            set.add(x);
        }
        for(int x:arr2){
            set.add(x);
        }
        int arr[]=new int[set.size()];
        int i=0;
       
       System.out.println(set.size());
       
    }
}
