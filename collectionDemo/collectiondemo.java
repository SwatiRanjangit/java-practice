package collectionDemo;

import java.util.*;

public class collectiondemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(60,70,80,90));
        
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(0, 50);
        arr.addAll(arr2);
        System.out.println(  arr.contains(40));
        System.out.println(  arr.get(2));
        System.out.println(  arr.indexOf(20));
        // System.out.println("arr: " + arr);

        //using for each loop to iterate over the elements.
        /* 
        for(Integer x:arr){
            System.out.println(x);
        }
        */
       //using Iterator loop to iterate over the elements.move in only one direction
        // Iterator<Integer> it = arr.iterator();

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

    //using ListIterator loop to iterate over the elements.move in only one direction
    //  ListIterator<Integer> it = arr.listIterator();

    //     while(it.hasNext()){
    //         System.out.println(it.next());
        
    // }

    //   for(ListIterator<Integer> it = arr.listIterator(); it.hasNext();){
    //     System.out.println(it.next());
    //   }

  // FOR EACH class of List class
//   arr.forEach(n->System.out.println(n));
  arr.forEach(n->show(n));

//    arr.forEach(System.out::println);

    }

    static void show(int n){
        if(n>60)
          System.out.println(n);
    }
}
