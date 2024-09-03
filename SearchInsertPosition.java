public class SearchInsertPosition {
    public static void main(String[]args){
        int index=0;
        int []nums={1,3,5,6};
        int target=100;
        for(int i=0;i<nums.length;i++){
          
            if(nums[i]==target){
                index=i;
                break;
             
            }else if(target>nums[i]){
               index=i+1;
            }else if(target>nums[nums.length-1]){
                index=nums.length;
            }
        }
        System.out.println(index);
       
    }
}
