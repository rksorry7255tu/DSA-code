//reverse array using loop
public class Reversearr2 {
    public static void main(String []args){
        int arr[]={1,2,3,4,2,3,5,2,9,3};
        int temp;
       int arrlen=arr.length-1;
        for(int i=0;i<(arr.length)/2;i++){
            temp=arr[i];
            arr[i]=arr[arrlen];
            arr[arrlen]=temp;
            arrlen--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
