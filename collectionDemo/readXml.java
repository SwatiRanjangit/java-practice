package collectionDemo;

import java.io.FileInputStream;
import java.util.Properties;

public class readXml {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        p.loadFromXML(new FileInputStream("C:/MyJava/myprop.xml"));
        System.out.println(p);
        System.out.println(p.getProperty("Brand"));


    }
}
