package collectionDemo;

import java.util.Comparator;
import java.util.PriorityQueue;


class MyComparator implements Comparator<Integer>{

    // we can give high value= high priority and small = small priority by using this interface method.
    public int compare(Integer o1, Integer o2){
        if(o1<o2) return 1;
        if(o1>o2) return -1;

        return 0;
    }

}

public class priorityqueuedemo {
    public static void main(String[] args) {
        // priority queue uses heap data structure for store and delete elements and 
        //by default , smaller no = high priority, larger no= low priority
        // time complexity for inserting and deletion : log(n)
//   PriorityQueue<Integer> pq = new PriorityQueue<>();    default value of priority is used.
  PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComparator());  // our made priority based.
  pq.add(20);
  pq.add(10);
  pq.add(30);
  pq.add(5);
  pq.add(15);
  pq.add(3);

  System.out.println("peak element: "+pq.peek());
  System.out.println("list of elements: ");
  pq.forEach(n->System.out.println(n));
  
  System.out.println("deleted element: "+ pq.poll());
  System.out.println("afer delting element list is:  ");

  pq.forEach(n->System.out.println(n));



    }
}
