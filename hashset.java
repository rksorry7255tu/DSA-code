import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        HashSet <Integer> set=new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);

        //Search-contains
       
       System.out.println( set); //true -if(it 1 is present then) else-false

        //delete
        set.remove(1);
        System.out.println( set);
        System.out.println(set.size());

       //Iterator
       Iterator it=set.iterator();
       while(it.hasNext())
       System.out.println(it.next());
     
       System.out.println(it.hasNext());


    }
}
