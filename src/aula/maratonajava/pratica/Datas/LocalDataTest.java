package aula.maratonajava.pratica.Datas;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class LocalDataTest {
    public static void main(String[] args) {
        data();
    }

    public static void data() {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Escreva 'Hoje' para ver a data: ");
            String verData = input.next();

            Locale l1 = new Locale("pt", "BR");
            Calendar calendar = Calendar.getInstance();
            DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, l1);
            LocalDate semana = LocalDate.now();
            LocalTime horas = LocalTime.now();

            if (verData.equalsIgnoreCase("hoje")) {
                System.out.println("Dia de hoje: " + df.format(calendar.getTime()));
            } else {
                throw new RuntimeException();
            }

            System.out.println("=========================================================");

            System.out.println("Escreva 'Dia' para ver o dia da semana: ");
            String verSemana = input.next();


            if (verSemana.equalsIgnoreCase("dia")) {
                System.out.println("Dia da semana: " + semana.getDayOfWeek());
            } else {
                throw new RuntimeException();
            }

            System.out.println("=========================================================");

            System.out.println("Escreva 'Horas' para ver o horario: ");
            String verHorario = input.next();

            if (verHorario.equalsIgnoreCase("horas")) {
                System.out.println("Horario: " + horas);
            } else {
                throw new RuntimeException();
            }

        } catch (Exception e) {
            throw new RuntimeException("Palavra invalida!");
        }

    }

}
