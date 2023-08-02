package collectionDemo;
import java.util.*;
public class linkedhashMapDemo {
    public static void main(String[] args) {
        // used to order access
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry e){
                // function to limit hashmap
                return size()>5;
            }
        };
        lhm.put(1, "hi");
        lhm.put(2, "hello");
        lhm.put(3, "byy");
        lhm.put(4, "siya");
        lhm.put(5, "ta");
        // lhm.put(9, "tta");
        // lhm.put(7, "holla");
        // lhm.put(8, "piya");

        String s= lhm.get(2);
        s=lhm.get(5);
        s=lhm.get(1);
        lhm.put(9, "tta");
        lhm.put(7, "holla");
        lhm.forEach((k,v)->System.out.println(k+" "+v));
    }
}
