import java.util.*;

public class recursion1 {
    public static void main(String[] args) {
        int n = 10;
        printhello(n);
    }

    public static void printhello(int n){
        if(n==0)
        return;
       
        System.out.println("Hello "+n);
        printhello(n-1);
       
    }
}
