public class validParenthesis {
    public static void main(String[] args) {
        String s="(){}}{";
        Boolean res=false;
        for(int i=0;i<s.length()-1;i++){
           if(s.charAt(i)=='('){
                if(s.charAt(i+1)==')'){
                    res=true;  
                }
            }
            if(s.charAt(i)=='{'){
                if(s.charAt(i+1)=='}'){
                    res=true;
                    
                }
            }
            if(s.charAt(i)=='['){
                if(s.charAt(i+1)==']'){
                    res=true;
                    
                }
            } 
             if(s.charAt(i)==')'){
                if(s.charAt(i+1)=='('){
                    res=false;
                    
                }
            }
             if(s.charAt(i)=='}'){
                if(s.charAt(i+1)=='{'){
                    res=false;
                    
                }
            }
             if(s.charAt(i)==']'){
                if(s.charAt(i+1)=='['){
                    res=false;
                    
                }
            }
             if(s.charAt(i)==')'){
                if(s.charAt(i+1)==')'){
                    res=false;
                    
                }
            }
             if(s.charAt(i)==']'){
                if(s.charAt(i+1)==']'){
                    res=false;
                    
                }
            }
             if(s.charAt(i)=='}'){
                if(s.charAt(i+1)=='}'){
                    res=false;
                    
                }
            }
             if(s.charAt(i)=='}'){
                if(s.charAt(i+1)=='{'){
                    res=false;
                    
                }
            }
             if(s.charAt(i)==')'){
                if(s.charAt(i+1)=='{'){
                    res=false;
                    
                }
            }
             if(s.charAt(i)==')'){
                if(s.charAt(i+1)=='['){
                    res=false;
                    
                }
            }
             if(s.charAt(i)=='{'){
                if(s.charAt(i+1)==')'){
                    res=false;
                    
                }
            }
             if(s.charAt(i)=='{'){
                if(s.charAt(i+1)==']'){
                    res=false;
                    
                }
            }
             if(s.charAt(i)=='['){
                if(s.charAt(i+1)==')'){
                    res=false;
                    
                }
            }
             if(s.charAt(i)=='['){
                if(s.charAt(i+1)=='}'){
                    res=false;
                    
                }
            }
            
        }
        System.out.println(res);
    }
}
