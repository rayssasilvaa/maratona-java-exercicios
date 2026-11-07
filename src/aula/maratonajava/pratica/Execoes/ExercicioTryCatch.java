package aula.maratonajava.pratica.Execoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioTryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Escreva sua idade");
            int idade = input.nextInt();

            if (idade < 1) {
                System.out.println("Idade invalida");
            }

            System.out.println("idade: " + idade);

        } catch (IllegalArgumentException | InputMismatchException e) {
            e.printStackTrace();
        } finally {
            System.out.println("PROGRAMA FINALIZADO!");
        }
    }
}