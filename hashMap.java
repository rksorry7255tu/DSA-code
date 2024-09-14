import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        HashMap <String,Integer> map= new HashMap<>();
        //Insertion
        map.put("India",120);
        map.put("us",30);
        map.put("china",150);
        System.out.println(map);
        map.put("china",180);
        System.out.println(map);
        System.out.println(map.containsKey("china"));
        System.out.println(map.get("china"));//out-180

        System.out.println(map.get("ind"));//out-null
        // for(Map.Entry<String,Integer> e: map.entrySet()){
        // System.out.println(e);
        // System.out.println(e.getKey());
        // System.out.println(e.getValue());
        // }

        Set<String> keys =map.keySet();
        for(String key:keys){
            System.out.println(key);
        }
        System.out.println(map.entrySet());
        System.out.println(map);

        //delete-operation
        map.remove("china");
        System.out.println(map);

        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
    
}
