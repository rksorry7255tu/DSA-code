import java.util.*;

public class StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Ravi");
        sb.insert(4,"Kumar");
        System.out.println(sb);
        sb.delete(0,4);
         System.out.println(sb);
         System.out.println(sb.charAt(0));
         StringBuilder sbb=new StringBuilder("h");
         sbb.append("e");
         sbb.append("llo");
         System.out.println(sbb);
    }
}
