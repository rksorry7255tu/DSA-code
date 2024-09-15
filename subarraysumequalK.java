 import java.util.*;
 class subarraysumequalK{
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        int sum=0;

        int count=0;
        int l=-10;
        for(int i=0;i<arr.length;i++){
             sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==l){
                    count++;
                    // for(int k=i;k<=j;k++){
                    //     System.out.println(arr[k]);
                    // }
                    // System.out.println();
                }
            }
        }
        System.out.println(count);

    }
}