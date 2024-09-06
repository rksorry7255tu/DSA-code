//print no 1 to 5

public class recursion2 {
    public static void main(String[] args) {
        printno(1);
    }
    public static void  printno(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        printno(n+1);
    }
}
