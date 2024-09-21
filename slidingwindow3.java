
//longest substring without repeating characters
import java.util.*;

public class slidingwindow3 {
    public static void main(String[] args) {
        // String s = "cadbzabcd";
        String s = "caecdsa";
        // HashSet<Character> set=new HashSet<>();
        int maxlength = 0;
        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> set = new HashSet<>();

            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    break;
                }

                set.add(s.charAt(j));
                maxlength=Math.max(maxlength,j-i+1);

            }
        }
        System.out.println(maxlength);
    }
}
