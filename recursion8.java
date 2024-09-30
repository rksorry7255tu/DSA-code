//sum of first n number

public class recursion8 {
    public static void main(String[] args) {
       sumofN(1, 5, 0);
    }
    public static void sumofN(int i,int n,int sum){
        if(i>n){
        System.out.println(sum);
        return ;
        }
        sum=sum+i;
        sumofN(i+1,n, sum);
        
    }
}
