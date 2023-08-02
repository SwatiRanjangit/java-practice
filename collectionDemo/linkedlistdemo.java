package collectionDemo;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class linkedlistdemo {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        LinkedList<Integer> arr2 = new LinkedList<>(List.of(60,70,80,90));
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(0, 50);
        arr.addAll(arr2);
        // System.out.println(  arr.contains(40));
        // System.out.println(  arr.get(2));
        // System.out.println(  arr.indexOf(20));
        arr.addFirst(100);
        arr.addLast(500);
        arr.removeFirst();
        System.out.println(arr.peek());
        
        arr.forEach(n->show(n));
    }

    static void show(int n){
        System.out.print(n+" ");
    }
}
