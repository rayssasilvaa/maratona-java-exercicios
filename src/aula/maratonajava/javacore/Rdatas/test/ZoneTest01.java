package aula.maratonajava.javacore.Rdatas.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneTest01 {
    public static void main(String[] args) {
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(tokyoZone);
        System.out.println(zonedDateTime1);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.now();
        System.out.println(zonedDateTime2);
    }
}
