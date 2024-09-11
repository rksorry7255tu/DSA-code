public class ispalindrom1 {
    public static void main(String[] args) {
           String s="A man, a plan, a canal: Panam";
           Boolean result=true;
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);

            if(ch1>=97&&ch1<=122||ch1>=48&&ch1<=57){
                if(ch2>=97&&ch2<=122||ch2>=48&&ch2<=57){
                    if(ch1!=ch2){
                        result= false;
                    }else{
                        i++;
                        j--;
                    }

                }else{
                    j--;
                }
            }
            else{
                i++;
            }
        }
        System.out.println(result);

       
    }
}
