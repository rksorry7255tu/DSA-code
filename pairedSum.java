// Given an array arr[] of distinct elements size N that is sorted and then rotated around an unknown point, the task is to check if the array has a pair with a given sum X.

// Examples : 

// Input: arr[] = {11, 15, 6, 8, 9, 10}, X = 16
// Output: true
// Explanation: There is a pair (6, 10) with sum 16

// Input: arr[] = {11, 15, 26, 38, 9, 10}, X = 35
// Output: true
// Explanation: There is a pair (26, 9) with sum 35

// Input: arr[] = {11, 15, 26, 38, 9, 10}, X = 45
// Output: false
// Explanation: There is no pair with sum 45.

public class pairedSum {
    public static void main(String[]args){
        int x=45;
        int arr[]={11, 15, 26, 38, 9, 10};
        int sum=0;
        int t=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum=arr[i]+arr[j];
                //System.out.println(sum);
                if(sum==x){
                    //System.out.println(x +"is the paired");
                    t=sum;
                }
            }
        }
        System.out.println(t);
        if(t==x){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
    }
}
