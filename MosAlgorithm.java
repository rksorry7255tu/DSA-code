import java.util.*;

import javax.management.Query;

public class MosAlgorithm {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 3, 4, 5, 2, 8 };
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        l1.add(0);
        l1.add(4);
        l2.add(1);
        l2.add(3);
        l3.add(2);
        l3.add(4);
        ArrayList<List<Integer>> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);
       
        for (List<Integer> x : list) {
            int sum=0;
            //System.out.println(x);
            int l = x.get(0);
            int r = x.get(1);
            for (int i = l; i <= r; i++) {
                sum=sum+arr[i];
                
            }
            System.out.println( "Sum of arr[] elements in range"+ x+ "is "+sum+ "");
        }

    }
}
