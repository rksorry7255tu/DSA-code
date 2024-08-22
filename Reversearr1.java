public class Reversearr1 {
    public static void main(String[]args){
        int arr[]={1,2,3,4};
        int revarr[]=new int[arr.length];
        int size=arr.length-1;
        for(int i=0;i<arr.length;i++){
            
           revarr[i]=  arr[size];
           size--;
           
            
        }
        for(int i=0;i<arr.length;i++){
           
            System.out.println(revarr[i]);
        }
    }
}
