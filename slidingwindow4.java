import java.util.*;

public class slidingwindow4 {
    public static void main(String[] args) {
        String s = "cadbzabcd";

        int l = 0;
        int r = 0;
        int maxlength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (r<s.length()) {
            if (map.containsKey(s.charAt(r))) {
                l=l+2;
                map.put(s.charAt(r),r);
            }
            map.put(s.charAt(r),r);
            maxlength=Math.max(maxlength,r-l+1);
            r++;
        }
        System.out.println(maxlength);
       
    }
}
