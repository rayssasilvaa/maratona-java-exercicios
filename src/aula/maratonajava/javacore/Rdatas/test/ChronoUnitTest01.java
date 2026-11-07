package aula.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        LocalDate aniverNamoro = LocalDate.of(2022, Month.OCTOBER, 17);
        System.out.println("Estamos juntas há: " + ChronoUnit.DAYS.between(aniverNamoro, agora) + " dias");
        System.out.println(ChronoUnit.YEARS.between(aniverNamoro, agora) + " anos de namoro");
    }
}
