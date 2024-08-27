// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
// Example 1:


// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
// Example 2:

// Input: height = [4,2,0,3,2,5]
// Output: 9
 
public class trappingrainwater {
    public static void main(String[]args){
        // int height[]={4,2,0,3,2,5};
         int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
         int trap=0;
        int left[]=new int [height.length];
        int right[]=new int [height.length];
        left[0]=height[0];
        for(int i=1;i<height.length;i++){
            if(height[i]>left[i-1]){
                left[i]=height[i];
            }else{
                left[i]=left[i-1];
            }
        }
        right[height.length-1]=height[height.length-1];
        for(int i=height.length-1;i>=1;i--){
            if(height[i-1]>=right[i]){
                right[i-1]=height[i-1];
            }else{
                right[i-1]=right[i];
            }
        }
        for(int i=0;i<height.length;i++){
            if(left[i]<right[i]){
                trap=left[i]-height[i]+trap;
            }
            if(right[i]<=left[i]){
                trap=right[i]-height[i]+trap;
            }
            
           
        }
        System.out.print(trap+" ");
    //    System.out.println();
    //     for(int i=0;i<height.length;i++){
    //         System.out.print(left[i]+" ");
    //     }
    //     System.out.println();
    //     for(int i=0;i<height.length;i++){
    //         System.out.print(right[i]+" ");
    //     }
    }
}
