package aula.maratonajava.pratica.Execoes;

import java.util.Scanner;

public class ExercicioThrowThrows {
    public static void main(String[] args) throws IllegalArgumentException {
        verIdade(0);
    }

    public static void verIdade(int idade) {

        Scanner input = new Scanner(System.in);

        System.out.println("Escreva sua idade: ");
        idade = input.nextInt();

        if (idade < 1) {
            throw new IllegalArgumentException("Idade invalida!");
        }

        if (idade < 18) {
            System.out.println("Menor de idade. Idade igual a " + idade);
        } else {
            System.out.println("Maior de idade. Idade igual a " + idade);
        }


    }
}
