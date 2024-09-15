import java.util.*;

public class intersectionsof2Arrays {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();
        int i=0;
        for(int x:arr1){
            set1.add(arr1[i++]);
            
        }
       //System.out.println(set1);
        for(int j=0;j<arr2.length;j++){
            if(set1.contains(arr2[j])==true){
                res.add(arr2[j]);
            }
        }
        System.out.println(res);
        
    }
}
