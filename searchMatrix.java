public class searchMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,4,7,11,15},{1,4,7,11,15},{ 3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=20;
        boolean result=false;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(matrix[i][j]==target){
                    result=true;
                }
            }
        }
        System.out.println(result);
    }
}
