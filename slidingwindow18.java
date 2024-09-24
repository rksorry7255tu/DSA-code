
//subarray with k different integer
import java.util.*;

public class slidingwindow18 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 4 };
        int k = 3;
        int r1=subarrayof(arr,k);
        int r2=subarrayof(arr,k-1);
        int result=r1-r2;
        System.out.println(result);
    }
    public static int subarrayof(int arr[],int k){
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int r = 0;
        int l = 0;
        while (r < arr.length) {
            if (!map.containsKey(arr[r])) {
                map.put(arr[r], 1);
            } else {
                map.put(arr[r], map.get(arr[r]) + 1);
            }
            while (map.size() > k) {
                if (map.get(arr[l]) == 1) {
                    map.remove(arr[l]);
                } else {
                    map.put(arr[l], map.get(arr[l]) - 1);
                }
                l++;
            }
            count = count + r - l + 1;
            r++;
        }
        return count;
    }
    
}
