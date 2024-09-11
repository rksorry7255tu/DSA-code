public class isPalindrom {
    public static void main(String[] args) {

        String s="Rar";
        s=s.toLowerCase();
        boolean result=true;
         
        for(int i=0;i<s.length()/2;i++){
            int front=i;
            int back=s.length()-1-i;
            char frontchar=s.charAt(front);
            char backchar=s.charAt(back);
           
          
            if(frontchar!=backchar){
                result=false;
                break;
            }else{
                result=true;
            }
        }
        System.out.println(result);
    }
}
