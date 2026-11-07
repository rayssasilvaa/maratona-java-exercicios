package aula.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();
        LocalTime horas = LocalTime.of(18, 35, 0);

        System.out.println(horaAtual);

        System.out.println(horas.getHour());
        System.out.println(horas.getMinute());
        System.out.println(horas.getSecond());

        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
