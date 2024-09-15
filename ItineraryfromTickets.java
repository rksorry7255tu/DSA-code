import java.util.*;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class ItineraryfromTickets {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("chennai", "bengaluru");
        map.put("mumbai", "delhi");
        map.put("goa", "chennai");
        map.put("delhi", "goa");

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        for (Map.Entry<String, String> e : map.entrySet()) {
            set1.add(e.getKey());
            set2.add(e.getValue());
        }
        String start = "";
        for (String x : set1) {
            if (set2.contains(x) == false) {
                start = x;
            }
        }
        for(int i=0;i<map.size()+1;i++){
            System.out.print(start+"->");
            start=map.get(start);
        }

    }
}
