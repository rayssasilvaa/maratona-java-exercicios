package aula.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime dateTime1 = LocalDateTime.of(2026, 10, 17, 12, 39, 12);

        System.out.println(dateTime);

        System.out.println(dateTime1.getDayOfMonth());
        System.out.println(dateTime1.getDayOfWeek());
        System.out.println(dateTime1.getHour());
    }
}

