package collectionDemo;

import java.util.HashSet;

public class hashingdemo {
    public static void main(String[] args) {
        // HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs = new HashSet<>(20, 0);
        hs.add(10);
        hs.add(20);
        hs.add(10);
        hs.add(30);
        hs.add(30);

        System.out.println(hs);
    }
}
