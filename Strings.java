import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // String s1="Ravi";
        // String fullname="Ravi Kumar";
        // String s2=sc.nextLine();
        // System.out.println(s2+" "+s1);



        // //concatination
         String firstname="Ravi";
        // String lastname="Kumar";
        // String name=firstname+lastname;
        // System.out.println(name);


        //Calculate length
        String str="Ravi";
        //System.out.println(str.length());

        //charAt()-function
        // for(int i=0;i<str.length();i++){
        //     System.out.println(str.charAt(i));
        // }

        //.compareTo()
        System.out.println(str.compareTo(firstname));
        System.out.println(str.compareToIgnoreCase(firstname));
        if(str==firstname){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }


        //this will give wrong output
        if(new String("Ravi")==new String("Ravi")){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }


        //substring
        String sentence="My name is Ravi";
        System.out.println(sentence.substring(0));
        System.out.println(sentence.substring(11,sentence.length()));
       



    }
}
