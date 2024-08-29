// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.
// Example 1:
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.



public class containerwithMostWater {
    public static void main(String []args){
         int height[]={1,8,6,2,5,4,8,3,7};
         //int height[]={1,1};
         int large=0;
       
        int area=0;
       
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int k=0;
                int width=j-i;
               
                if(height[i]<=height[j]){
                    area=width*height[i];
                    if(large<area){
                        large=area;
                    }
                   
                    
                }else if(height[i]>height[j]){
                    area=width*height[j];
                    if(large<area){
                        large=area;
                    }
                   
                }
               

            }
        }
        System.out.println(large);
       
        
    }
}
