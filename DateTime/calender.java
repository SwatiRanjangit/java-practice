package DateTime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class calender {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        // System.out.println(gc.isLeapYear(2020));
        // System.out.println(gc.get(Calendar.MONTH));
        // System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));  // to chnage the time zone
        TimeZone tz =gc.getTimeZone();
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());

    }
}
