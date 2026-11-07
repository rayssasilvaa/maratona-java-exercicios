package aula.maratonajava.pratica.Datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DataInput {
    public static void main(String[] args) throws Exception {
        dateInput();
    }

    public static void dateInput() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Escreva sua data de nascimento: (dd/MM/yyyy) ");
            String data = input.next();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataInput = LocalDate.parse(data, formatter);
            LocalDate hoje = LocalDate.now();

            if (dataInput.isAfter(hoje)) {
                throw new IllegalArgumentException("ERRO: Data invalida");
            }

            System.out.println("Escreva sua opção escolhida para exibição: (DIA, MES, ANOS) ");
            String opcao = input.next().toUpperCase();

            switch (opcao) {
                case "DIA":
                    long dias = ChronoUnit.DAYS.between(dataInput, hoje);
                    System.out.println("Diferença de dias: " + dias);
                    break;

                case "MES":
                    long mes = ChronoUnit.MONTHS.between(dataInput, hoje);
                    System.out.println("Se passaram: " + mes + " meses!");
                    break;

                case "ANOS":
                    long anos = ChronoUnit.YEARS.between(dataInput, hoje);
                    System.out.println("Se passaram: " + anos + " anos!");
                    break;

                default:
                    System.out.println("Opção invalida!");
            }

        } catch (DateTimeParseException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            System.out.println("Sistema finalizado... Execute novamente!");
        }
    }
}



