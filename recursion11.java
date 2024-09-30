public class recursion11 {
    public static void main(String[] args) {
        String s="rar";
        boolean res=palindrom(0,s.length()-1,s);
        System.out.println(res);
    }
    public static boolean palindrom(int l,int r,String s){
        if(s.length()==1)
        return true;
        else if(s.charAt(l)==s.charAt(r)&&l<=r){
            palindrom(l+1, r-1, s);
            return true;
        }
        else 
        return false;

    }
}
