public class nextpermutation {
    public static void main(String[] args) {
        int nums[] = {2,3,1};
        int index = -1;
        int temp;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }

        }
         //System.out.println(index);

        if (index == -1) {
            // Array.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] > nums[j]) {
                        temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }

        }else{
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[index]){
                    temp=nums[i];
                    nums[i]=nums[index];
                    nums[index]=temp;
                    break;
                }
            }
         index=index+1;
         //System.out.println(index);
            for(int i=index;i<nums.length;i++){
               
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]>nums[j]){
                        temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                    }
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        
    }
}
