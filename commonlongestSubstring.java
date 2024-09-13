import java.util.Arrays;
import java.util.*;
public class commonlongestSubstring {
    public static void main(String[] args) {
        String strs[]={"flower","flow","flight"};
         StringBuilder res=new StringBuilder();
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
       
        for(int i=0;i<Math.min(first.length(),last.length());i++){
           if(first.charAt(i)!=last.charAt(i)){
          
           }
           res.append(first.charAt(i));
        }
        System.out.println(strs[1].length());
    }
}
