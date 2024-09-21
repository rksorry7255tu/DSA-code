public class longestcharacterreplacement {
    public static void main(String[] args) {
        int k = 0;
         String s="BBBA";
        int l = 0;
        int r = 0;
        int maxlength = 0;
        int chars = 0;
        while (r < s.length()) {
           // if(k!=0)
            if (s.charAt(r) != s.charAt(l)) {
                chars++;
            
          
            if (chars > k) {
                l++;
                if (s.charAt(l) == s.charAt(r)) {
                    l++;
                    chars--;
                }
            }
            }
            
            maxlength = Math.max(maxlength, r - l + 1);
            r++;
            
        }
     
        System.out.println(maxlength);
    }
}
