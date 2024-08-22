import java.lang.Character.Subset;
import java.util.*;
class main2{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String name="Ravi";
        
        // System.out.println("enter a string");
        // String str=sc.nextLine();
        // System.out.println(str);

        //concatenation
        String firstname="Ravi";
        String lastname="Kumar";
        String fullname=firstname+" "+lastname;
        System.out.println(fullname);

        //String length
        System.out.println(fullname.length());

        //use of charAt()
        for( int i=0; i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
        
        //compareTo
        String name1="ravi";
        String name2="Ravi";
        System.out.println(name1.compareTo(name2));//this will return +ve value
        //s1>s2 : +ve value
        //s1=s2 : 0
        //s1<s2 : -ve value

        System.out.println(name1==name2);
        String a1=new String(name1);
        String a2=new String(name1);
        if(a1==a2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        //substring of a string
        String sentence="I am a Ravi Kumar";
        System.out.println(sentence.substring(0,3));
        System.out.println(sentence.substring(3));

        //strings are immutable
         sentence="I am a Ravi ";
        System.out.println(sentence);
    }
}