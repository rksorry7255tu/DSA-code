public class anagram {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        char []res=new char[s.length()];
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        for(int i=0;i<charArray1.length;i++){

            for(int j=0;j<charArray2.length;j++){
                if(charArray1[i]==charArray2[j]){
                    res[i]=charArray2[j];
                    break;
                }
            }
        }
        String str2=String.valueOf(res);
        System.out.println(str2);
        boolean result=false;
        if(s.compareTo(str2)==0){
            result= true;
        }
        System.out.println(result);
      
        

    }
}
