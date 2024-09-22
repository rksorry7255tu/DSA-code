//longest substring with at most k distinct character
import java.util.*;

public class slidingwindow9 {
    public static void main(String[] args) {
        String s="aaabbccd";
        int k=2;
        HashMap<Character,Integer>map=new HashMap<>();
        int l=0; int r=0; int maxlength=0;

        while(r<s.length()){
            if(!map.containsKey(s.charAt(r))){
                map.put(s.charAt(r),1);
            }else{
                map.put(s.charAt(r),map.get(s.charAt(r))+1);
            } 
            if(map.size()>2){ 
                //if(map.size()>2){
                    map.put(s.charAt(l),map.get(s.charAt(l))-1);
                    if(map.get(s.charAt(l))==0){
                        map.remove(s.charAt(l));
                    }
                    l++;
               // }
            }
            maxlength=Math.max(maxlength,r-l+1);
            r++;
        }
        System.out.println(maxlength);
    }
}
