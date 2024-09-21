//Maximum point you can obtain from carda

public class slidingwindow2 {
    public static void main(String[] args) {
        int arr[]={6,2,3,6,7,2,1,7,1};
        int k=4;

        int leftsum=0;
        int left=0;
        int rightsum=0;
        int sum=0;
        for(int i=0;i<k;i++){
            leftsum=leftsum+arr[i];
            left=leftsum;
        }
        int rindex=arr.length-1;
        for(int i=k-1;i>=0;i--){
            leftsum=leftsum-arr[i];
            rightsum=rightsum+arr[rindex];
            rindex--;
            sum=Math.max(sum,leftsum+rightsum);
        }
        sum=Math.max(sum,left);
        System.out.println(sum);
        
    }
}
