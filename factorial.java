public class factorial {
    public static void main(String[] args) {
        int n=5;
        int res=printfact(n);
       System.out.println(res);
    }
    public static int  printfact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n * printfact(n-1);
    }
}
