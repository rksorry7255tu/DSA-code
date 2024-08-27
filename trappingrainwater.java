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
         //int height[]={4,2,0,3,2,5};
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int small=height[0];
        int large=height[0];
        int largeindex=0;
        int smallindex=0;
        int trap=0;
        
        for(int i=0;i<height.length;i++){
            if(height[i]>large){
                large=height[i];
                largeindex=i;
                //System.out.println(large);  
            }
            if(height[i]>small){
                if (height[i]<large){
                    small=height[i];
                    smallindex=i;
                }
            } 
        }
         if(small==height[0]){
        for(int i=smallindex;i<largeindex;i++){
            if((smallindex+i+1)<largeindex){
                trap=height[smallindex]-height[smallindex+i+1]+trap;
                
            }
           
         }
        System.out.println(trap);
    }else{
        int size=height.length-1;
        for(int i=0;i<height.length/2;i++){
            trap=height[size]-height[i]+trap;
            size--;
        }
        System.out.println(trap);
    }
   



        //  System.out.println(large);
        // System.out.println(largeindex);
        // System.out.println(small);
        // System.out.println(smallindex);
    }
}
