public class recursion4 {
    public static void main(String[] args) {  
        printno(1,10,0);
    }
    public static void printno(int start,int end,int sum){
        if(start==end){
            sum=sum+start;
            System.out.println(sum);
            return;
        }
        sum=sum+start;
        //System.out.println(sum);
        printno(start+1,end,sum);
    }
}
