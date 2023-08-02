package collectionDemo;

import java.util.StringTokenizer;

public class tokeizerDemo {
    public static void main(String[] args) {
        // String data ="name=Vijay;address=Delhi;country=india;course=cse";
        // String data ="name=Vijay\naddress=Delhi\ncountry=india\ncourse=cse";   // \n is also behave like delimeter so we don't need to specify in delimeter.
        String data ="name=Vijay address=Delhi country=india course=cse";   // \n is also behave like delimeter so we don't need to specify in delimeter.
        StringTokenizer stk = new StringTokenizer(data, "= "); // we have to mention space in delimeter otherwise it won't work like a delimeter bydefault.
        String s;
        while(stk.hasMoreTokens()){
            s = stk.nextToken();
            System.out.println(s);
        }

    }
}
