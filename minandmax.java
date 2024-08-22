// Given an array arr. Your task is to find the minimum and maximum elements in the array.

public class minandmax {
    public static void main(String args[]) {
        int arr[]={-1,1,2,3,4,3,2,-20,90,-19,0,2,3,-500};
        int min=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
          
            if(min>=arr[i]){
                min=arr[i];
            }
            if(max<=arr[i]){
                max=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
