//print number from 5 to 1

public class recursion {
    public static void main(String[] args) {
        // //iteration loop concept
        // for(int i=5;i>0;i--){
        //     System.out.print(i+" ");
        // }


        //recursion
        printnos(5);
    }
    public static void  printnos(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnos(n-1);
    }
}
