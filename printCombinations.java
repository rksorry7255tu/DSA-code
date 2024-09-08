public class printCombinations {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int r=4;
        int result[]=new int[arr.length];
        
        int k=0;
        if(r==1){
        for(int i=0;i<arr.length;i++){
            result[i]=arr[i];
            System.out.println(result[i]);
            
        }
    }
    else if(r==2){
        for(int i=0;i<arr.length;i++){
            result[k]=arr[i];
            for(int j=i+1;j<arr.length;j++){
              
                k=k+1;
                result[k]=arr[j];
                
                if(k==r-1){
                    for(int l=0;l<r;l++){
                        System.out.print(result[l]+" ");
                    } 
                    System.out.println();
                    k=0;
                }  
            }
       }
    }
    else if(r==3){
        for(int i=0;i<arr.length;i++){
            result[k]=arr[i];
            for(int j=i+1;j<arr.length;j++){
                k++;
                result[k]=arr[j];
                for(int l=j+1;l<arr.length;l++){
                    k++;
                    result[k]=arr[l];
                   for(int p=0;p<r;p++){
                    System.out.print(result[p]);
                   }
                   System.out.println();
                   k=k-1;
                }
                k--;
            }
            
        }
    }
    else if(r==4){
        for(int i=0;i<arr.length;i++){
           result[i]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(result[i]+"");
         }

    }

       
    }
}
