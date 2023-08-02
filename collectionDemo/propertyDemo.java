package collectionDemo;

import java.io.FileOutputStream;
import java.util.Properties;

public class propertyDemo {
    public static void main(String[] args) throws Exception {
        // key and value type should be only of string type
        Properties p = new Properties();
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows10");
        p.setProperty("Model", "Latitude");
        // p.store(new FileOutputStream("C:/MyJava/myprop.txt"), "Laptop");
        //use to create xml file and store it.
        p.storeToXML(new FileOutputStream("C:/MyJava/myprop.xml"), "Laptop");
        System.out.println(p);
    }
}
