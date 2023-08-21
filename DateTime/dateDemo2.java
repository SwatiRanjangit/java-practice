package DateTime;
import java.util.Date;
public class dateDemo2 {
    public static void main(String[] args) {
        // Date d = new Date();
        @Deprecated
        Date d = new Date("1/1/1990");
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
    }
}
