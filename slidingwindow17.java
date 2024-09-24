//subarray with k different integer
import java.util.*;
public class slidingwindow17 {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,4};
        int k=3;
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            HashSet<Integer>set=new HashSet<>();
            for(int j=i;j<arr.length;j++){
                set.add(arr[j]);
                if(set.size()==k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
