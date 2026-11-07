package aula.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("Instant: " + now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println("LocalDateTime: " + LocalDateTime.now());

    }
}
