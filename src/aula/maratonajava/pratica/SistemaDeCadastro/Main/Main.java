package aula.maratonajava.pratica.SistemaDeCadastro.Main;

import aula.maratonajava.pratica.SistemaDeCadastro.Usuario.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Conta.conta(input);
    }
}
