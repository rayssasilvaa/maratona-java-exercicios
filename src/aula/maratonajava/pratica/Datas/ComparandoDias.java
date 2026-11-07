package aula.maratonajava.pratica.Datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ComparandoDias {
    public static void main(String[] args) {
        datas();
    }

    public static void datas() {
        LocalDate aniverNini = LocalDate.of(2007, Month.JUNE, 19);
        LocalDate aniverYssa = LocalDate.of(2005, Month.NOVEMBER, 12);
        LocalDate now = LocalDate.now();

        System.out.println("Ingrid esta: " + ChronoUnit.DAYS.between(aniverNini, now) + " dias viva!");
        System.out.println("Rayssa esta: " + ChronoUnit.DAYS.between(aniverYssa, now) + " dias viva");
    }

}
