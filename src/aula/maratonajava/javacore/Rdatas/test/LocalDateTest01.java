package aula.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2005, Month.NOVEMBER, 12);
        LocalDate hoje = LocalDate.now();

        System.out.println("Ano atual: " + date.getYear());
        System.out.println("Mes atual: " + date.getMonth());
        System.out.println("Valor do mes atual: " + date.getMonthValue());
        System.out.println("Dia da semana: " + date.getDayOfWeek());
        System.out.println("Dia do mes: " + date.getDayOfMonth());
        System.out.println("Quantidade de dia do mes: " + date.lengthOfMonth());
        System.out.println("É um ano bisexto? (TRUE OR FALSE): " + date.isLeapYear());
        System.out.println("Apenas data: " + date);

        System.out.println("=================================");
        System.out.println("Dia de hoje: " + hoje);
    }
}
