package DateTime;

import java.time.*;

import java.time.format.*;
import java.time.temporal.ChronoField;
public class chronoFieldDemo {
    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.now();
        System.out.println(ld.get(ChronoField.DAY_OF_MONTH));
        System.out.println(ld.get(ChronoField.AMPM_OF_DAY));
    }
    
}
