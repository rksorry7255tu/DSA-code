public class findTarget {
    public static void main(String[]args){
        int [] nums={4,5,6,7,0,1,2,3};
        int results=search(nums,0);
        System.out.println(results);
       
    }
 

    public static int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
