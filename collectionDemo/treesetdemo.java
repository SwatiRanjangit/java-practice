package collectionDemo;

import java.util.*;
import java.util.TreeSet;

public class treesetdemo {
    public static void main(String[] args) {
        // tree are used for searching in log(n) time complexity so it is faster than anyone.
        // elements are sorted
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,40,2,34));
        ts.add(30);
        
        System.out.println(ts);
        System.out.println(ts.ceiling(35));



    }
}
