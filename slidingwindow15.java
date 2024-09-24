//count the no of nice subarray

public class slidingwindow15 {
    public static void main(String[] args) {
        
        int arr[]={1,5,2,1,1};
        int goal=3;
       int result=noofoccurance(arr,goal)-noofoccurance(arr,goal-1);
        System.out.println(result);
    }
    public static int noofoccurance( int arr[],int goal){
        int l=0;
        int r=0;
        int sum=0;
        int count1=0;
        while(r<arr.length){
            sum=sum+arr[r]%2;
            while(sum>goal){
                sum=sum-arr[l]%2;
                l++;  
            }
             if(sum<=goal){
                count1=count1+r+1-l;
            }
            r++;
        }
        return count1;
    }
}
