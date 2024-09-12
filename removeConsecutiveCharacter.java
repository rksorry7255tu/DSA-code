// Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

// Example 1:

// Input:
// S = aabb
// Output:  ab 
// Explanation: 'a' at 2nd position is
// appearing 2nd time consecutively.
// Similiar explanation for b at
// 4th position.

public class removeConsecutiveCharacter {
    public static void main(String[] args) {
          String s="abbaacss";
          String str="";
          str=str+s.charAt(0);
          for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i+1)!=s.charAt(i)){
                str=str+s.charAt(i+1);
            }
          }
          System.out.println(str);
         

       
    }
}
