package collectionDemo;
import java.util.*;

class My implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        if(a<b)
           return 1;
        if(a>b)
           return -1;
        return 0;
    }
}

public class comparatorDemo {
    public static void main(String[] args) {
        Integer a[]={2,4,11,8,9,10};
        // int b[] = {2,4,6,8,9};
        // int c[] = Arrays.copyOf(a, a.length);
        // Arrays.fill(c,10);
        // Arrays.sort(c);
        // System.out.println(Arrays.compare(a,b));
        // System.out.println(Arrays.compare(a,b)); // compare on the basis of elements
        
        Arrays.sort(a, new My());

       for(int x:a){
        System.out.println(x);
       }

    //    System.out.println(Arrays.binarySearch(c,2));

    }
}
