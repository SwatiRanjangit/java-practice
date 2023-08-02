package collectionDemo;

import java.util.BitSet;

public class bitSetDemo {
    public static void main(String[] args) {
        BitSet bs = new BitSet();
        bs.set(0);
        bs.set(2);
        bs.set(4);
        bs.set(6);
        bs.set(8);
        System.out.println(bs);

        System.out.println(bs.get(1));
         BitSet bs1= new BitSet();
        //  bs1.set(0);
         bs1.set(1);
        //  bs1.set(2);
         bs1.set(3);
        //  bs1.set(4);
         bs1.set(5);
        //  bs1.set(6);
         bs1.set(7);
        //  bs1.set(8);

        //  bs.and(bs1);
        //  bs.or(bs1);
        //  System.out.println(bs);

         bs.flip(0, bs.length());
         System.out.println("after flip: "+ bs);

    }
}
