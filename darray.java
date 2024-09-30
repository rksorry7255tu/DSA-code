import java.util.*;
public class darray {
    public static void main(String[]args){
        int [][] arr=new int [2][2];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                if (arr[i][j] == 5) {
                    System.out.println(arr[i][j]);
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
}
