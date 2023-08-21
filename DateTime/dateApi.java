package DateTime;

import java.time.*;

public class dateApi {
    public static void main(String[] args) {
        ZonedDateTime sdt = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        // OffsetDateTime sdt = OffsetDateTime.now();
        System.out.println(sdt);
        // System.out.println(sdt);
        MonthDay md = MonthDay.now();
        // System.out.println(md);
        Period p = Period.of(2,2,10);
       System.out.println(p.addTo(LocalDate.now()));

       Instant i =Instant.now();
       System.out.println(i);
    }
}
