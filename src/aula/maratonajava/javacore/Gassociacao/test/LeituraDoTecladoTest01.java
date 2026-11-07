package aula.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = input.nextLine();
        System.out.println("Digite sua idade:");
        int age = input.nextInt();
        System.out.println("Digite M ou F para seu saxo: ");
        char sex = input.next().charAt(0);
        System.out.println("Dados recebidos com sucesso!");
        System.out.println("Nome: " + name + " || Idade: " + age + " || Sexo: " + sex);
    }
}
