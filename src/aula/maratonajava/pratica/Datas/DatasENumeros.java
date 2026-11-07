package aula.maratonajava.pratica.Datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class DatasENumeros {
    public static void main(String[] args) {
        local();
    }

    public static void local() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Escreva seu país para ver a data de hoje: ");
            String pais = input.nextLine();

            Locale br = new Locale("pt", "BR");
            Locale eua = new Locale("us", "EUA");
            Locale ita = new Locale("it", "ITA");

            Calendar calendar = Calendar.getInstance();

            DateFormat pt = DateFormat.getDateInstance(DateFormat.FULL, br);
            DateFormat us = DateFormat.getDateInstance(DateFormat.FULL, eua);
            DateFormat it = DateFormat.getDateInstance(DateFormat.FULL, ita);

            switch (pais.toLowerCase()) {
                case "brasil":
                    System.out.println("Data padrão no Brasil: " + pt.format(calendar.getTime()));
                    break;
                case "estados unidos":
                    System.out.println("Data padrão nos EUA: " + us.format(calendar.getTime()));
                    break;
                case "italia":
                    System.out.println("Data padrão na Italis: " + it.format(calendar.getTime()));
                    break;

                default:
                    System.out.println("ERRO: Pais invalido");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
