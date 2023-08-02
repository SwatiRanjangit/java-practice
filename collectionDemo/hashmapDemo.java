package collectionDemo;

import java.util.*;


public class hashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> tm = new HashMap<>(Map.of(1,"hi",2,"hello",3,"byy"));
    
        tm.put(4,"myself");
        tm.put(5,"me");
        

        System.out.println(tm);

    }
}
