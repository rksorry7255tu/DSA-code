import java.util.*;
public class recursion6 {
    public static void main(String[] args) {
        printnum(1, 10);
    }   
    public static void printnum(int i,int n){
        if(i>n)
        return;
        System.out.println(i);
        printnum(i+1, n);
    }
}
