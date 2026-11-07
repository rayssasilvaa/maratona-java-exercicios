package aula.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua pergunta, responderei com SIM ou NÂO!");
        String ask = input.nextLine();
        if (ask.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }
}
