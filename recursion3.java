//print sum of first n natural no

public class recursion3 {
    public static void main(String[] args) {
        printno(1,10,0);
    }
    public static void printno(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
      sum+=i;
      printno(i+1,n,sum);
       
    }
}
