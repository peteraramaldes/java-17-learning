package switches;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Switch {

    public boolean isFreeDay() {
        DayOfWeek dow = LocalDate
                .now()
                .getDayOfWeek();

        switch (dow) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                return false;
            case FRIDAY:
            case SUNDAY:
                return true;
        }

        throw new IllegalStateException("Unexpected value: " + dow);
    }

}