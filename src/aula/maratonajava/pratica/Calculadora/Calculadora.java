package aula.maratonajava.pratica.Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = input.nextInt();

        System.out.println("Escolha a operação: (+, -, *, /)");
        String operacao = input.next();

        System.out.println("Escreva outro numero: ");
        int n2 = input.nextInt();

        int total = 0;

        switch (operacao) {
            case "+":
                total = n1 + n2;
                break;
            case "-":
                total = n1 - n2;
                break;
            case "*":
                total = n1 * n2;
                break;
            case "/":
                total = n1 / n2;
                break;
            default:
                System.out.println("Operação invalida!");
                input.close();
        }
        System.out.println("total: " + total);

    }

}
