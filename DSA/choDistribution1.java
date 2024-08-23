
public class choDistribution1 {
    public static void main(String[]args){
        int arr[]={12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m=7;
        int temp;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>=arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
      
      
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }
        int Diff = 0;
        int minDiff = 0;
        System.out.println();
         for(int i=0;i<=arr.length-(m-1);i++){
            if(i+(m-1)<=arr.length-1){
             //System.out.println(arr[i+m-1]);

            Diff=arr[i+m-1]-arr[i];
            // System.out.println(Diff);
            arr[i]=Diff;
            }
            if(Diff<minDiff){
                minDiff=Diff;
             }
          
            
         }
         for(int i=0;i<arr.length;i++){
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>=arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
         
         
           System.out.println(arr[0]);
    }
}

