package chap32;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateSample {
    public static void main(String[] args) {
        DayOfWeek[] dayOfWeeks = DayOfWeek.values();
        Locale locale = Locale.getDefault();

        for (DayOfWeek day : dayOfWeeks) {
            System.out.print(day.getDisplayName(TextStyle.FULL, locale) + " ");
            System.out.print(day.getDisplayName(TextStyle.SHORT, locale) + " ");
            System.out.println(day.getDisplayName(TextStyle.NARROW, locale) + " ");
        }
    }
}
