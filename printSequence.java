// Convert a sentence into its equivalent mobile numeric keypad sequence
// Last Updated : 18 Jan, 2024
// Given a sentence in the form of a string, convert it into its equivalent mobile numeric keypad sequence. 

// Mobile-keypad

// Examples : 

// Input: GEEKSFORGEEKS
// Output: 4333355777733366677743333557777
// Explanation: For obtaining a number, we need to press a number corresponding to that character for a number of times equal to the position of the character. For example, for character E, press number 3 two times and accordingly.

// Input : HELLO WORLD
// Output : 4433555555666096667775553

public class printSequence {
    public static void main(String[] args) {
        String S="WTXNP";
        int res[]=new int[S.length()];
        String res1="";
        
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='A'||S.charAt(i)=='B'||S.charAt(i)=='C'){
                if(S.charAt(i)=='A'){
                    res1="2";
                }else if(S.charAt(i)=='B'){
                    res1="22";
                }else if(S.charAt(i)=='C'){
                    res1="222";  
                }
            }else if(S.charAt(i)=='D'||S.charAt(i)=='E'||S.charAt(i)=='F'){
                if(S.charAt(i)=='D'){
                    res1="3";
                }else if(S.charAt(i)=='E'){
                    res1="33";
                }else if(S.charAt(i)=='F'){
                    res1="333";
                }
            }else if(S.charAt(i)=='G'||S.charAt(i)=='H'||S.charAt(i)=='I'){
                if(S.charAt(i)=='G'){
                    res1="4";
                }else if(S.charAt(i)=='H'){
                    res1="44";
                }else if(S.charAt(i)=='I'){
                    res1="444";
                }
            }else if(S.charAt(i)=='J'||S.charAt(i)=='K'||S.charAt(i)=='L'){
                if(S.charAt(i)=='J'){
                    res1="5";
                }else if(S.charAt(i)=='K'){
                    res1="55";
                }else if(S.charAt(i)=='L'){
                    res1="555";
                }
            }else if(S.charAt(i)=='M'||S.charAt(i)=='N'||S.charAt(i)=='O'){
                if(S.charAt(i)=='M'){
                    res1="6";
                }else if(S.charAt(i)=='N'){
                    res1="66";
                   
                }else if(S.charAt(i)=='O'){
                    res1="666";
                }
            }else if(S.charAt(i)=='P'||S.charAt(i)=='Q'||S.charAt(i)=='R'||S.charAt(i)=='S'){
                if(S.charAt(i)=='P'){
                    res1="7";
                }else if(S.charAt(i)=='Q'){
                    res1="77";
                }else if(S.charAt(i)=='R'){
                    res1="777";
                }else if(S.charAt(i)=='S'){
                    res1="7777";
                }
            }else if(S.charAt(i)=='T'||S.charAt(i)=='U'||S.charAt(i)=='V'){
                if(S.charAt(i)=='T'){
                    res1="8";
                }else if(S.charAt(i)=='U'){
                    res1="88";
                }else if(S.charAt(i)=='V'){
                    res1="888";
                }
            }else if(S.charAt(i)=='W'||S.charAt(i)=='X'||S.charAt(i)=='Y'||S.charAt(i)=='Z'){
                if(S.charAt(i)=='W'){
                    res1="9";
                }else if(S.charAt(i)=='X'){
                    res1="99";
                   
                }else if(S.charAt(i)=='Y'){
                    res1="999";
                    
                }else if(S.charAt(i)=='Z'){
                    res1="9999";
                }
             }else if(S.charAt(i)==' '){
               
                res1="0";
            }
            System.out.print(res1);
        }
       
    }
}
