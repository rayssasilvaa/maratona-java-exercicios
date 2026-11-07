package aula.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        //representa uma quantidade de tempo baseada em datas

        LocalDate hoje = LocalDate.now();
        LocalDate aniversario = LocalDate.of(2005, Month.NOVEMBER, 12);
        Period p1 = Period.between(hoje, aniversario);

        System.out.println(p1);


    }
}
