package aula.maratonajava.pratica.Datas;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class BrincandoComDatas {
    public static void main(String[] args) {
        //strings();
        System.out.println("-------------------------------");
        datas();
    }

    public static void strings() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        String nome = input.nextLine();

        System.out.println("Seu nome em minusculo: " + nome.toLowerCase());
        System.out.println("Seu nome em maiusculo: " + nome.toUpperCase());
        System.out.println("A primeira letra do seu nome é " + nome.charAt(0));
        System.out.println("Seu nome contém " + nome.length() + " caracteres.");
    }

    public static void datas() {
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();
        LocalDateTime dataEHora = LocalDateTime.now();
        DateFormat datas = DateFormat.getInstance();

        System.out.println("Dia de hoje: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Dia e Hora: " + dataEHora);

        System.out.println(datas);
    }
}
