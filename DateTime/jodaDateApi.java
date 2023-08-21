package DateTime;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.*;
public class jodaDateApi {
    public static void main(String[] args) {
        // Date d = new Date();
        // d.setHours(21);
        // System.out.println(d);

        // LocalDate d = LocalDate.now();
        // LocalDate d1 = LocalDate.now(Clock.systemDefaultZone());
        // LocalDate d1 = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        // LocalDate d1 = LocalDate.of(2020, Month.MARCH, 10);
        LocalDate d1 = LocalDate.parse("2020-01-03");
        LocalDate d =d1.plusMonths(6);
        System.out.println(d);
        LocalTime t = LocalTime.now();
        LocalTime t1 =t.minusHours(3);
        System.out.println(t);
        System.out.println(t1);

        LocalDateTime lt =LocalDateTime.now();
        System.out.println(lt);





    }
}
