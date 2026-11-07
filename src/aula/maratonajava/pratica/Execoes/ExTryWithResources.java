package aula.maratonajava.pratica.Execoes;

import java.util.Scanner;

public class ExTryWithResources {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Escreva seu nome: ");
            String nome = input.nextLine();

            System.out.println("Escrava sua idade: ");
            int idade = input.nextInt();

            System.out.println("Nome: " + nome + " | Idade: " + idade);
        } finally {
            System.out.println("Finalizado!");
        }
    }
}
