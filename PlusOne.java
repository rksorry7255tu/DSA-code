public class PlusOne {
    public static void main(String[] args) {
        int []digits={1,2,3};
       
        for(int i=0;i<digits.length;i++){

            if(i==digits.length-1){
                digits[i]++;
            }

        }
        for(int i=0;i<digits.length;i++){
            System.out.println(digits[i]);
        }
       
    }
}
