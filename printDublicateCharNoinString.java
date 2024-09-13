// Print all the duplicate characters in a string

// Given a string S, the task is to print all the duplicate characters with their occurrences in the given string.

// Example:

// Input: S = “geeksforgeeks”
// Output:
// e, count = 4
// g, count = 2
// k, count = 2
// s, count = 2


import java.util.*;
public class printDublicateCharNoinString{
    public static void main(String[] args) {
        String s= "geeksforgeeks";
       char CharArray[]=s.toCharArray();
       Arrays.sort(CharArray);
       String str1=String.valueOf(CharArray);
       for(int i=0;i<s.length();i++){
        int count=1;
        while(i<s.length()-1&&str1.charAt(i)==str1.charAt(i+1)){
          count++;
          i++;
        }
        if(count>=2){
            System.out.println(str1.charAt(i)+" "+count);
        }
    } 
    System.out.println(str1);

    }
}