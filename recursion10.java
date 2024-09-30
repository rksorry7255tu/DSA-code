public class recursion10 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,8};
        reverse(0,arr.length-1,arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void reverse(int l,int n,int arr[]){
       
        if(l>n/2+1){   
        return ;
        }
        int temp=arr[l];
        arr[l]=arr[n];
        arr[n]=temp;
        reverse(l+1, n-1, arr);
        
    }

}
