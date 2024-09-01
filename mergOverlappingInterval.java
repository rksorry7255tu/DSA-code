// Given a set of time intervals in any order, our task is to merge all overlapping intervals into one and output the result which should have only mutually exclusive intervals.

// Example:

// Input: arr = {{1,3},{2,4},{6,8},{9,10}}
// Output: {{1, 4}, {6, 8}, {9, 10}}
// Explanation: Given intervals: [1,3],[2,4],[6,8],[9,10], we have only two overlapping intervals here,[1,3] and [2,4]. Therefore we will merge these two and return [1,4],[6,8], [9,10].

// Input: arr = {{6,8},{1,9},{2,4},{4,7}}
// Output: {{1, 9}} 
import java.util.*;

public class mergOverlappingInterval {
    public static void main(String[] args) {
        // int intervals[][]= {{1,3},{2,4},{6,8},{9,10}};
        int intervals[][] = { { 6, 8 }, { 1, 9 }, { 2, 4 }, { 4, 7 } };
       ArrayList <int []> list=new ArrayList<>();
       
        //Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));
        list.add(intervals[0]);

        for(int i=1;i<intervals.length;i++){
            int [] current=intervals[i];
            int [] last=list.get(list.size()-1);
            if(current[0]<last[1]){
                last [1]=Math.max(current[1],last[1]);
            }else{
                list.add(current);
            }

        }
       // System.out.println(list);
        for (int[] interval : list) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
     
       

     
    }

}
