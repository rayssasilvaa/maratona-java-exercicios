package aula.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {

        /*representa uma quantidade de tempo baseada em segundos e nanossegundos,
          ideal para medir intervalos curtos ou precisos, como tempo de execução de código.
        */

        LocalDateTime data = LocalDateTime.now();
        LocalDateTime dataComMaisDoisAnos = LocalDateTime.now().plusYears(2);

        LocalTime horas = LocalTime.now();
        LocalTime horasComMais10Horas = LocalTime.now().plusHours(10);

        System.out.println(data);
        System.out.println(dataComMaisDoisAnos);
        System.out.println(horas);
        System.out.println(horasComMais10Horas);

        Duration d1 = Duration.between(data, dataComMaisDoisAnos);
        System.out.println("Se passaram: " + d1 + " ");
    }
}
