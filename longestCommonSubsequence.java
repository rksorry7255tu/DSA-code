public class longestCommonSubsequence {
    public static void main(String[] args) {
        String text1 = "ezupkr";
        String text2 ="ubmrapg";
        int no=0;

      
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                if(text1.charAt(i)==text2.charAt(j)){
                    no++;
                    System.out.println(text1.charAt(i));
                    
                }
            }
           
        }
        if(no==0){
            no=0;
           
        }
        System.out.println(no);
    }
}
