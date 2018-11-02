package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeUntilDemo {
    public static void main(String[] args) {
        LocalDateTime localDateTimeA = LocalDateTime.now();
        LocalDateTime localDateTimeB = localDateTimeA.plusMinutes(20);
        System.out.println(localDateTimeA.until(localDateTimeB, ChronoUnit.MILLIS));
        System.out.println(ChronoUnit.MINUTES);
    }
}
