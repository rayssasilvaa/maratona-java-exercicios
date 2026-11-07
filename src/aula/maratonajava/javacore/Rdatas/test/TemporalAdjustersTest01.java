package aula.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje: " + hoje);

        hoje = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("proxima sexta: " + hoje);

        hoje = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("Primeiro dia do mes: " + hoje);
        System.out.println("Dia da semana: " + hoje.getDayOfWeek());

        hoje = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Ultimo dia do mes: " + hoje);
        System.out.println("Dia da semana: " + hoje.getDayOfWeek());

    }
}
