//converting codes for practice
import java.util.*;
public class basic {
    public static void main(String[] args) {

        //converting int to string
      int a=123;
      String s=String.valueOf(a);
      int c = 123; 
      String str3 = Integer.toString(c);
      System.out.println(s+" "+str3);

      //converting String to int
      String str="123";
      int b=Integer.valueOf(str);
      int d=Integer.parseInt(str);
      System.out.println(d+" "+b);


      //converting arr of int to arr of string
      int arr[]={1,2,3,4};
      String [] arr1=new String[arr.length];
      String str1=Arrays.toString(arr);
      System.out.println(str1);
      for(int i=0;i<arr.length;i++){
        arr1[i]=Integer.toString(arr[i]);
        System.out.println(arr1[i]);
      }
  
      //converting String array to integer array
      String [] arr2={"1234","2345","3456"};
      int [] arr3=new int[arr2.length];
      for(int i=0;i<arr2.length;i++ ){
        arr3[i]=Integer.parseInt(arr2[i]);
        System.out.println(arr3[i]);
      }
     

    }
}
