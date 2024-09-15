//Given an integer array of size n, find all elements that appear more than n/3 times.
// nums[]={1,3,2,5,1,3,1,5,1}
//ans=1
import java.util.*;
//import java.util.HashSet;
public class hashingQ1 {
    public static void main(String[] args) {
        //int  nums[]={1,3,2,5,1,3,1,5,1};
        int  nums[]={1,2};
        HashSet<Integer> set=new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int freq=1;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])==false){
                map.put(nums[i],freq);
            }else if(map.containsKey(nums[i])==true){
                int value=map.get(nums[i])+1;
                map.put(nums[i],value);
            }
          
        }
        System.out.println(map);
        
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>nums.length/3){
                set.add(e.getKey());
            }
        }
        Iterator it=set.iterator();
        for(int x:set)
        System.out.println(it.next());
        
      
       
    }
}
