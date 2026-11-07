package aula.maratonajava.pratica.Tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in);) {
            String repetir;

            System.out.println("===TABUADA===");

            do {
                System.out.println("Escreva o numero para a tabuada a baixo: ");
                int n = input.nextInt();

                System.out.println("Numero inserido: " + n);

                for (int i = 0; i <= 10; i++) {
                    int res = n * i;
                    System.out.println(n + " x " + i + " = " + res);
                }

                System.out.println("Gerar outra tabuada? (S/N)");
                repetir = input.next();

            } while (repetir.equalsIgnoreCase("S"));
            System.out.println("Programa encerrado!");
        }

    }
}
