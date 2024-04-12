package academy.devdojo.maratonajava.javacore.Rdatas.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2025-07-27");
        LocalTime time = LocalTime.parse("12:25:00");
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ltd1 = date.atTime(time);
        LocalDateTime ltd2 = time.atDate(date);
        System.out.println(ltd1);
        System.out.println(ltd2);
    }
}
