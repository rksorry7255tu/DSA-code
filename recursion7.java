public class recursion7 {
    public static void main(String[] args) {
        printnum(1, 3);
    }
    public static void printnum(int i,int n){
        if(i>n)
        return;
        printnum(i+1, n);
        System.out.println(i);
    }
}
