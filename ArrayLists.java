import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class ArrayLists {
    public static void main(String []args){
        ArrayList <Integer> list =new ArrayList<Integer>();
        ArrayList <String> list2 =new ArrayList<String>();
        ArrayList <Boolean> list3 =new ArrayList<Boolean>();
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);


        int ele1=list.get(0);
        System.out.println(ele1);


       // int ele2=list.get(1);
        list.add(1,1);
        System.out.println(list);
        list.add(0,5);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        int size=list.size();
        System.out.println(size);
       

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        Collections.sort(list);
        System.out.println(list);

        int arr[]={9,3,7,4,1,0};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }



    }
}
