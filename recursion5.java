import java.util.*;

public class recursion5 {
    public static void main(String[] args) {
        printname("ravi", 10);
    }
    public static void printname(String s,int n){
        if(n==0)
        return;
        System.out.println(s);
        printname(s,n-1);
    }
}
