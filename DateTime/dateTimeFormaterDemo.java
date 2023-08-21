package DateTime;
import java.time.*;

import java.time.format.*;

public class dateTimeFormaterDemo {
    public static void main(String[] args) {
        // LocalDateTime ld = LocalDateTime.now();
        ZonedDateTime ld = ZonedDateTime.now();

        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z Z");
        System.out.println(d.format(ld));
    }
}
