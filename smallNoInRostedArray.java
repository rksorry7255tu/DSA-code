public class smallNoInRostedArray {
    public static void main(String[]args){
        int nums[]={4,5,6,7,0,1,2,3};
        int small=nums[0];
        for(int i=0;i<nums.length;i++){
            if(small>nums[i]){
                small=nums[i];
            }
        }
        System.out.println(small);
    }
}
