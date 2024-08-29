public class containerwithmostWater1 {
    public static void main(String[]args){
        int height[]={1,8,6,2,5,4,8,3,7};
         //int height[]={1,1};
        int area=0;
        int l=0;
        int r=height.length-1;
        int largearea=0;
        for(int i=0;i<height.length-1;i++){
           
            int width=r-l;
           
            if(height[l]<height[r]){
                area=width*height[l];
                l++;
                if(largearea<area){
                    largearea=area;
                }
               
              
            }
            else{
                area=width*height[r];
                r--;
                if(largearea<area){
                    largearea=area;
                }
               
            }
        }
        System.out.println(largearea);
    }
}

//hence in this solution time complexity is less
