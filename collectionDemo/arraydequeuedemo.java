package collectionDemo;

import java.util.ArrayDeque;

public class arraydequeuedemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        //using like a stack.
     System.out.println("using as stack");

        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.offerLast(50);
        dq.forEach(x->System.out.print(x+" "));
        dq.pollLast();
        System.out.println("after");
        dq.forEach(x->System.out.print(x+" "));
        
        //using as dequeue
        System.out.println();
        System.out.println("using as dequeue");
        dq.offerFirst(23);
        dq.offerFirst(45);
        dq.offerFirst(50);
        dq.forEach(x->System.out.print(x+" "));
        dq.pollLast();
        dq.forEach(x->System.out.print(x+" "));
        





    }
}
