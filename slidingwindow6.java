import java.util.*;

public class slidingwindow6 {
    public static void main(String[] args) {
        int arr[]={3,3,3,1,2,1,1,2,3,3,4};
        int maxlength=0;

        for(int i=0;i<arr.length;i++){
            HashSet<Integer> set=new HashSet<>();
             System.out.println("first ="+arr[i]);
            for(int j=i;j<arr.length;j++){
                System.out.println(arr[j]);
               set.add(arr[j]);
               if(set.size()<=2){
                
                maxlength=Math.max(maxlength,j-i+1);
               }else{
              
                break;
               }
            }
            System.out.println("maxlength="+maxlength);
           System.out.println(set);
        }
        System.out.println(maxlength);
    }
}
