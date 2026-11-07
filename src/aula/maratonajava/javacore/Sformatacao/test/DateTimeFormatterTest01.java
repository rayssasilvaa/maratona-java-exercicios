package aula.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDateOf = LocalDate.of(2005, Month.NOVEMBER, 12);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateNowFormatter = localDateOf.format(formatter);
        String dateOfFormatter = localDate.format(formatter);
        System.out.println(dateNowFormatter + "\n" + dateOfFormatter);

        System.out.println("Se passaram: " + (ChronoUnit.YEARS.between(localDateOf, localDate)) + " anos.");
    }
}
