package collectionDemo;

import java.util.Hashtable;

public class hashTableDemo {
    public static void main(String[] args) {
        //older version use this now it is replaced by hashset, hashmap and linkedhash etc.
        // Hashtable ht = new Hashtable();
        Hashtable<Integer, String> ht = new Hashtable();
        ht.put(1,"a");
        ht.put(2,"b");
        ht.put(3,"c");
        ht.put(4,"ad");
        
        ht.compute(2,(k,v)->v+"Z");
        // String str = (String)ht.get(3);
        // System.out.println(str);

        System.out.println(ht);


    }
}
