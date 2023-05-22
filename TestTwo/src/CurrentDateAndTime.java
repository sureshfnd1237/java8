package src;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentDateAndTime {
    public static void main(String[] args) {
        prentDateAndTime();
    }

    private static void prentDateAndTime() {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime  = LocalDateTime.now();
        System.out.println(dateTime);
    }
}
