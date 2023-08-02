package collectionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.StringTokenizer;

public class readFromFileTokenizer {
    public static void main(String[] args) throws Exception {
        FileInputStream fs = new FileInputStream("C:/MyJava/myprop.txt");
        byte b[] = new byte[fs.available()];
        fs.read(b);

        String data = new String(b);
        StringTokenizer st = new StringTokenizer(data, "=");
        String s;
        while(st.hasMoreTokens()){
            s=st.nextToken();
            System.out.println(s);
        }

    }
}
