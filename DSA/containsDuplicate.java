public class containsDuplicate {
    public static void main(String[]args){
       
       
        int arr[]={1,1,1,3,3,4,3,2,4,2};
        int temp;
        for(int i=0;i<arr.length;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>=arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int t=-1;
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        for(int i=0;i<arr.length-1;i++){
            
            if(arr[i]==arr[i+1]){
                t=1;
                break;
            }
            else{
               t=0;
               
            }
        }
        if(t==1){
            System.out.println("duplicate exist");
        }else if(t==0){
            System.out.println("duplicate does not exist");
        }
        
        
        

    }
   
    
}
