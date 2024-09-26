// Given an array of strings strs, group the 
// anagrams
//  together. You can return the answer in any order.

 

// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]

// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

import java.util.*;

public class anagram1 {
    public static void main(String[] args) {
        String [] strs={"eat","tea","tan","ate","nat","bat"};
        HashMap<String,ArrayList<String>>map=new HashMap<>();
        
        for(String word:strs){
            char[] CharArray=word.toCharArray();
            Arrays.sort(CharArray);
            String sortword=new String(CharArray);
            //System.out.println(sortword);
            if(!map.containsKey(sortword)){
                map.put(sortword,new ArrayList<>());
            }
           map.get(sortword).add(word);
          
        }
        ArrayList list=new ArrayList<>(map.values());
        System.out.println(list);
    }
}
