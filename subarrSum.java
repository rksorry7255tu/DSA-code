public class subarrSum {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        int k=3;
        int noSubarr=0;
        
        for(int i=0;i<nums.length;i++){
            int sum=0;
            //sum=nums[i];
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum==k){
                    noSubarr++;
                }
               
            }
        }
        System.out.println(noSubarr);
    }
}
