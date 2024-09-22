//longest substring with at most k distinct character

import java.util.*;
public class slidingwindow8 {
    public static void main(String[] args) {
        String s="aaabbccd";
        int k=2;
        
        int maxlength=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                set.add(s.charAt(j));
                if(set.size()>2){
                    break;
                }
                maxlength=Math.max(maxlength,j-i+1);
            }
            System.out.println(set);
            System.out.println(maxlength);
        }
        System.out.println(maxlength);
    }
}
