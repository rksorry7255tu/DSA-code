public class choDistribution {
    public static void main(String[] args) {
        int arr[] = { 7, 3, 2, 4, 9, 12, 56 };
        int m = 3;
        int temp;
        //first sorting the array
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int Diff = 0;
        int minDiff = 0;

        //for checking the steps to step we did this commented codes
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");

        // }

        System.out.println();
        //this is the conditions to iterate upto which index 
        for (int i = 0; i <= arr.length - (m - 1); i++) {
            //again inner condition
            if (i + (m - 1) <= arr.length - 1) {
                // System.out.println(arr[i+m-1]);

                Diff = arr[i + m - 1] - arr[i];
                // System.out.println(Diff);
                arr[i] = Diff;
            }

        }
        //storing the Diff in the arr[] only and sorting to get the minimum difference
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
