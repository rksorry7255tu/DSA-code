//no of string containing all three characters

import java.util.*;
public class slidingwindow10 {
    public static void main(String[] args) {
        String s="bbacba";
       // HashSet<Character> set=new HashSet<>();
       int count=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                set.add(s.charAt(j));
                if(set.size()==3){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
