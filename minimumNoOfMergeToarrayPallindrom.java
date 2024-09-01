public class minimumNoOfMergeToarrayPallindrom {
    public static void main(String[]args){
        int arr[]={1,4,5,1,2};
        int result=0;
        int j=arr.length-1;
        for(int i=0;i<=j;){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }else if(arr[i]>arr[j]){
            j--;
            arr[j]=arr[j]+arr[j+1];
            result++;
           }else if(arr[j]>arr[i]){
            i++;
            arr[i]=arr[i]+arr[i-1];
            result++;
           }  
        }
        System.out.println(result);

       
    }
}
