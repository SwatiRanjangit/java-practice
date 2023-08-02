package collectionDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class linkedHashsetDemo {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        // LinkedHashSet<Integer> h=new LinkedHashSet<>();
        h.add(1);
        h.add(3);
        h.add(2);
        h.add(4);
        h.add(6);

        h.forEach(System.out::println);
    }
}
