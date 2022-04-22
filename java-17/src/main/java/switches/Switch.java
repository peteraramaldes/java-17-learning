package switches;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Switch {

    public boolean isFreeDay() {
        DayOfWeek dow = LocalDate
                .now()
                .getDayOfWeek();

        return switch (dow) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> false;
            case FRIDAY, SUNDAY -> true;
            default -> throw new IllegalStateException("Unexpected value: " + dow);
        };
    }

}