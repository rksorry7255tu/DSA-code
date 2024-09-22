//Max consecutive ones 111

import java.util.*;

public class slidingwindow5 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int zero = 0;
        int l = 0;
        int r = 0;
        int maxlength = 0;
        while (r < arr.length) {
           if(arr[r]==0){
            zero++;
           }
           while(zero>k){
            l++;
            if(arr[l]==0){
                l++;
                zero--;
                break;
            }
           }
            maxlength = Math.max(maxlength, r - l + 1);
            r++;
        }
        System.out.println(maxlength);
    }
}
