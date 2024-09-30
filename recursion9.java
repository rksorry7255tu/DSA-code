public class recursion9 {
    public static void main(String[] args) {
       int res= printsumofN(5);
       System.out.println(res);
    }
    public static int  printsumofN(int n){
       
       if(n==0)
       return n;
       return n=n+printsumofN(n-1);
      
    }
}
