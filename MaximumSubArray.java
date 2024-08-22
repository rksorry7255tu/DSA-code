// Given an integer array nums, find the subarray
//  with the largest sum, and return its sum.
public class MaximumSubArray{
    public static void main(String[]args){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int substring=0;
        int temp;
        for(int i=0;i<arr.length;i++){
            int small=i;
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
          }
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                arr[i+1]=0;
            }
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
     
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                substring=substring+arr[i];
            }
        }
        System.out.println(substring);
    }
}