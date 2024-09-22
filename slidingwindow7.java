import java.util.*;

public class slidingwindow7 {
    public static void main(String[] args) {
        int arr[] = { 3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4 };
        int l = 0;
        int r = 0;
        int maxlength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (r < arr.length) {
           
            if (!map.containsKey(arr[r]))
                map.put(arr[r], 1);
            else
                map.put(arr[r], map.get(arr[r]) + 1);

            if (map.size() > 2) {
                //while (map.size() > 2) {
                    map.put(arr[l], map.get(arr[l]) - 1);
                    if (map.get(arr[l]) == 0) {
                        map.remove(arr[l]);
                    }
                    l++;
               // }
            }
            if(map.size()<=2){
                maxlength = Math.max(maxlength, r - l + 1);
            }
            r++;
        }
        System.out.println(maxlength);

    }
}
