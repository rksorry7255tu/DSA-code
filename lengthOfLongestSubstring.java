// Given a string s, find the length of the longest 
// substring
//  without repeating characters.

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        // String s= "pwwkew";
        String s= "bbbb";
        int count=1;
        char res[]=new char[s.length()];
        for(int i=1;i<s.length();i++){
           char current=s.charAt(i);
           if(s.charAt(i-1)==s.charAt(i)){
                i++;
                count=1;
           }
            if(s.charAt(i-1)!=s.charAt(i)){
               
                 for(int j=0;j<i;j++){
                    if(j<i&&res[j]==current){
                        count=1;
                        break;
                    }
                    
                    count++;
                   
                }
            }
            System.out.println(count);
        }

    }
}
